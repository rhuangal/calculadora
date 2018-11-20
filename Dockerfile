FROM openjdk:8-jre-alpine
EXPOSE 8080

ADD /target/calculadora*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]