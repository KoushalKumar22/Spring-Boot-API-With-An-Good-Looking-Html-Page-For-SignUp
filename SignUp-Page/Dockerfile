

# Use a base image with Java 17
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

#Set the expose port to run on
EXPOSE 8080

# Copy the executable JAR file into the container
COPY target/NewUserSignUp.jar /app/app.jar

# Specify the command to run the JAR file
ENTRYPOINT ["java", "-jar", "/app/app.jar"]