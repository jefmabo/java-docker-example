# DOCKERFILE

## Instrução FROM

Esta instrução irá definir qual imagem será utilizada pela aplicação. 

Neste exemplo, `FROM openjdk:16-alpine3.13`, estamos usando uma imagem alpine que trata-se se um SO unix com a jdk 16.

## Instrução EXPOSE

A instrução `EXPOSE 5000` está definindo ao container que a porta 5000 será acessível ao meio externo, isso é necessário para que a aplicação possa ser acessada dentro do container ou para que possamos mapear uma porta do SO com a porta 5000.

## Instrução WORKDIR

Esta instrução define que iremos utilizar como diretório de trabalho dentro do container a pasta app, toda aplicação estará disponível em `~/app`.

## Instrução COPY

Realiza a copia dos arquivos do SO para o container.

## Instrução RUN

Executa um comando shell dentro do container, no exemplo `RUN ./mvnw dependency:go-offline` ele está obtendo as dependências da aplicação.

## Instrução CMD

No exemplo `CMD ["./mvnw", "spring-boot:run"]` a aplicação será executada dentro do container.

# EXECUÇÃO

Para executar esta aplicação pela primeira vez será necessário executar o comando `docker build .`, este comando irá criar uma imagem dentro do sistema operacional e ao final da execução será exibido o id da imagem. 

Caso perca o id pode ser executado o comando `docker image ls`, que irá listar todas imagens disponíveis na máquina local.

Para executar a aplicação é necessário a imagem docker ter sido construída e só então deve executar o comando `docker run <id_da_imagem> -p <porta_local>:5000`, onde `-p` é a instrução que mapeará a porta do container com uma porta do SO.

# DOCKER-COMPOSE