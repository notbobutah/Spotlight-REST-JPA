FROM openjdk:18-jdk-buster

WORKDIR /app
EXPOSE 8080

COPY ./target/spotlight-0.0.1-SNAPSHOT.jar .

RUN apt update
RUN apt-get install -y watch
RUN  apt-get install traceroute
RUN pwd
RUN ls -l
RUN env
CMD ["java", "-jar", "/app/spotlight-0.0.1-SNAPSHOT.jar"]
# CMD ["traceroute", "db"]