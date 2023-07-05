FROM openjdk:11-jdk
ARG JAR_FILE=target\*.jar
COPY ${JAR_FILE} taco-cloud31.jar
ENTRYPOINT ["java", "-jar", "/taco-cloud31.jar"]