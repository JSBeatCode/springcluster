# Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim

# Set the working directory to /app
WORKDIR /app

# Copy the Maven build artifact (JAR file) into the container's working directory
COPY target/clusterapp-0.0.1-SNAPSHOT.jar clusterapp.jar

# Expose port 8080 to the host
EXPOSE 8080

# Entrypoint command to run the application
ENTRYPOINT ["java", "-jar", "clusterapp.jar"]