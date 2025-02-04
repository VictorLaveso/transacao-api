# Nome do Projeto
Desafio técnico para desenvolvedor Júnior do Itaú (treino)

## Descrição
Este é um projeto com estrutura simples feito em Java que utiliza Spring Boot, incluindo organização de pacotes, uso de classes e o uso de container Docker. 
O objetivo final desse projeto é aperfeiçoar as habilidades adquiridas.

## Tecnologias Utilizadas
- Java 17
- Gradle Kotlin
- Spring Boot 3.4.2
- JUnit 5

## Container Docker
https://hub.docker.com/r/victorlaveso/transacao-api

## Estrutura do Projeto onde houve modificações
```
transacao-api/
|-- build.gradle.kts
|-- src/
|   |-- main/
|   |   |-- java/
|   |   |   |-- com/
|   |   |   |   |-- desafioItau/
|   |   |   |   |   |-- transacao_api/
|   |   |   |   |   |   |-- TransacaoApiApplication.java
|   |   |   |   |   |   |-- business/
|   |   |   |   |   |   |   |-- services/
|   |   |   |   |   |   |   |   |-- EstatisticasService.java
|   |   |   |   |   |   |   |   |-- TransacaoService.java
|   |   |   |   |   |   |-- controller/
|   |   |   |   |   |   |   |-- EstatisticasController.java
|   |   |   |   |   |   |   |-- TransacaoController.java
|   |   |   |   |   |   |   |-- dtos/
|   |   |   |   |   |   |   |   |-- EstatisticasResponseDTO.java
|   |   |   |   |   |   |   |   |-- TransacaoRequestDTO.java
|   |   |   |   |   |   |-- infrastructure/
|   |   |   |   |   |   |   |-- exceptions/
|   |   |   |   |   |   |   |   |-- UnprocessableEntity.java

## Desafio
https://github.com/rafaellins-itau/desafio-itau-vaga-99-junior

## Modificado por
- Nome: VictorLaveso
- GitHub: [VictorLaveso](https://github.com/VictorLaveso)

Readme.txt criado por: VictorLaveso
