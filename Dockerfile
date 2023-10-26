FROM openjdk:11
COPY ./target/scientificCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp","scientificCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar","org.example.Main"]