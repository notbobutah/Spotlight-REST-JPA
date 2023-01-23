FROM openjdk:18-slim-buster

WORKDIR /app
EXPOSE 8080

COPY ./target/spotlight-0.0.1-SNAPSHOT.jar .
RUN "pwd"
RUN "ls" "-l"
CMD ["java", "-jar", "/app/spotlight-0.0.1-SNAPSHOT.jar"]