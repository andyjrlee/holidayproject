FROM maven:latest
COPY . /build
WORKDIR /build
RUN mvn clean package

FROM openjdk:11 AS runtime
WORKDIR /opt
EXPOSE 8080
COPY --from=0 /build/target/holidayproject-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
