# Nome do Projeto
Desafio técnico para desenvolvedor Júnior do Itaú (treino)

## Descrição
Este é um projeto com estrutura simples feito em Java que utiliza Spring Boot, incluindo organização de pacotes e uso de classes.

## Tecnologias Utilizadas
- Java 17
- Gradle Kotlin
- Spring Boot 3.4.2
- JUnit 5

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

## Autor
- Nome: angelicaweiler

## Modificado por
- Nome: VictorLaveso
- GitHub: [VictorLaveso](https://github.com/VictorLaveso)

Readme.txt criado por: VictorLaveso
