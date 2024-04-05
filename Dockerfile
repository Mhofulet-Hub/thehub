# Use an official OpenJDK image as the base
FROM openjdk:11-jre-slim

# Copy your Java source file into the container
COPY src/User.java /app/

# Set the working directory
WORKDIR /app

# Install the JDK and compile the Java source file
RUN apt-get update && \
    apt-get install -y openjdk-11-jdk && \
    javac User.java

# Set the entry point for running your Java program
CMD ["java", "User"]
