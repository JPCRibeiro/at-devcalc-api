FROM eclipse-temurin:19-jdk
WORKDIR /app
COPY target/AT-PipelinesCICD-1.0-SNAPSHOT.jar ./app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]