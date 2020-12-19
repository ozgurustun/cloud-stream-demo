FROM adoptopenjdk/openjdk11:latest
ARG JAR_FILE=/target/*.jar
COPY ${JAR_FILE} rabbit-producer-0.1.jar
ENTRYPOINT ["java", "-jar","/rabbit-producer-0.1.jar"]