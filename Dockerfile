FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-example-docker.jar spring-boot-example-docker.jar 
ENTRYPOINT ["java","-jar","/spring-boot-example-docker"]