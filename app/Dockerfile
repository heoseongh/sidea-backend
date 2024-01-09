FROM openjdk:17-alpine

ARG JAR_FILE_PATH=./build/libs/sideA-backend-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE_PATH} /sideA-backend.jar

ENTRYPOINT ["java", "-jar", "/sideA-backend.jar"]