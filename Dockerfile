FROM openjdk:11
COPY ./target/calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "calculator-1.0-SNAPSHOT-jar-with-dependencies.jar", "org.example.Calculator"]