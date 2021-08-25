FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-example-private-registry.jar spring-boot-example-private-registryr.jar 
ENTRYPOINT ["java","-jar","/spring-boot-example-private-registry"]
