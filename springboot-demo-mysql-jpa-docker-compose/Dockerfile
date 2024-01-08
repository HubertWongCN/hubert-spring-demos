FROM openjdk:8-jre
MAINTAINER hubert
WORKDIR /
ADD target/springboot-demo-mysql-jpa.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar"]
CMD ["app.jar"]