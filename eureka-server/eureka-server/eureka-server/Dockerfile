FROM openjdk:21
WORKDIR /eureka-service
COPY target/eureka-server-0.0.1-SNAPSHOT.jar eureka-server-0.0.1-SNAPSHOT.jar
EXPOSE 8761

# Run the JAR file
ENTRYPOINT ["java", "-jar", "eureka-server-0.0.1-SNAPSHOT.jar"]