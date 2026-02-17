FROM maven:3.9.12-amazoncorretto-25 AS maven
WORKDIR /app
COPY pom.xml .
COPY src src
RUN mvn clean package
FROM amazoncorretto:25-jdk AS jdk
WORKDIR /app
COPY --from=maven /app/target/shopping-list-be-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]