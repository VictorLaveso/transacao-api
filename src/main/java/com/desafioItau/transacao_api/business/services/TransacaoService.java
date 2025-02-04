package com.desafioItau.transacao_api.business.services;

import com.desafioItau.transacao_api.controller.dtos.TransacaoRequestDTO;
import com.desafioItau.transacao_api.infrastructure.exceptions.UnprocessableEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TransacaoService {

    private final List<TransacaoRequestDTO> listTransacoes = new ArrayList<>();

    public void addTransacoes(TransacaoRequestDTO transacaoRequestDTO) {

        log.info("Processamento para gravar transações iniciado.");
        if (transacaoRequestDTO.dataHora().isAfter(OffsetDateTime.now())) {
            log.info("Data e hora maiores que o momento");
            throw new UnprocessableEntity("Data e hora inválida");
        }
        if (transacaoRequestDTO.valor() < 0) {
            log.error("Valor deve ser igual ou superior a 0");
            throw new UnprocessableEntity("Valor negativo não é permitido");
        }
        log.info("Transação adicionada com sucesso.");
        listTransacoes.add(transacaoRequestDTO);
    }

    public List<TransacaoRequestDTO> buscarTransacoes(Integer tempoBusca) {
        OffsetDateTime tempoIntervalo = OffsetDateTime.now().minusSeconds(tempoBusca);
        log.info("Transaçoes retornadas com sucesso.");
        return listTransacoes.stream().filter(transacoes -> transacoes.dataHora().isAfter(tempoIntervalo)).toList();
    }

    public void limparTransacoes() {
        listTransacoes.clear();
        log.info("Transações deletadas com sucesso");
    }
}
