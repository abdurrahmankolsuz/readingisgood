FROM openjdk:8-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=target/spring-boot-readingisgood-1.0.0.jar
ADD ${JAR_FILE} spring-boot-readingisgood
ENTRYPOINT ["java","-jar","/spring-boot-readingisgood.jar"]