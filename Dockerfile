FROM openjdk:22-ea-21-jdk-slim
LABEL authors="rohit"
WORKDIR /usr/src/app
VOLUME /tmp
ENV PORT=8080
EXPOSE 8080
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
