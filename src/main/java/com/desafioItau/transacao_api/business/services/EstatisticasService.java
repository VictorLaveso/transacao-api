package com.desafioItau.transacao_api.business.services;

import com.desafioItau.transacao_api.controller.dtos.EstatisticasResponseDTO;
import com.desafioItau.transacao_api.controller.dtos.TransacaoRequestDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.DoubleSummaryStatistics;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class EstatisticasService {

    public final TransacaoService transacaoService;

    public EstatisticasResponseDTO getEstatisticas(Integer tempoBusca) {

        log.info("Busca de estatisticas de transações pelo periodo de tempo: " + tempoBusca);
        List<TransacaoRequestDTO> transacoes = transacaoService.buscarTransacoes(tempoBusca);

        if (transacoes.isEmpty()) {
            return new EstatisticasResponseDTO(0L, 0.0,0.0,0.0,0.0);
        }

        DoubleSummaryStatistics estatisticasTransacoes = transacoes.stream().mapToDouble(TransacaoRequestDTO::valor).summaryStatistics();

        return new EstatisticasResponseDTO(estatisticasTransacoes.getCount(), estatisticasTransacoes.getSum(), estatisticasTransacoes.getAverage(), estatisticasTransacoes.getMin(), estatisticasTransacoes.getMax());
    }
}
