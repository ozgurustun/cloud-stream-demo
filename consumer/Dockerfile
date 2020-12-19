FROM adoptopenjdk/openjdk11:latest
ARG JAR_FILE=/target/*.jar
COPY ${JAR_FILE} rabbit-consumer-kafka-producer-0.1.jar
ENTRYPOINT ["java", "-jar","rabbit-consumer-kafka-producer-0.1.jar"]