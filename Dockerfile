FROM openjdk:alpine
COPY ./target/garage-sensor-0.0.1-SNAPSHOT.jar /usr/src/app
WORKDIR /usr/src/app
CMD ["java", "garage-sensor-0.0.1-SNAPSHOT.jar"]
