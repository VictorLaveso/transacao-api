# Usa uma imagem base do OpenJDK 17
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho no container
WORKDIR /app

# Copia o arquivo JAR correto para dentro do container
COPY build/libs/transacao-api-0.0.1-SNAPSHOT.jar app.jar

# Define o comando para rodar a aplicação
CMD ["java", "-jar", "app.jar"]