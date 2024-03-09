# Use a Java 18 Alpine base image
FROM openjdk:18-jdk-alpine

# Copy the JAR file into the container
ADD target/spring-docker.jar spring-docker.jar

# Set the working directory
#WORKDIR /user/app

# Create a dummy file to update the modification time
#RUN sh -c 'touch spring-docker.jar'

# Define the entry point
ENTRYPOINT ["java", "-jar", "spring-docker.jar"]
  