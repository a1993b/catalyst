FROM openjdk:8-jdk-alpine
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} catalyst.jar
ENTRYPOINT ["java","-jar","/catalyst.jar"]