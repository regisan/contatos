FROM amazoncorretto:latest
MAINTAINER Regis Santos
RUN mkdir -p /opt/contatos
COPY ./build/libs/contatos-0.0.1-SNAPSHOT.jar /opt/contatos
WORKDIR /opt/contatos
ENTRYPOINT java -jar contatos-0.0.1-SNAPSHOT.jar