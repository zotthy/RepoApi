
FROM maven:latest AS build

COPY . /app

WORKDIR /app

RUN mvn clean package -DskipTests

RUN ls -la /app/target

FROM openjdk:21

COPY --from=build /app/target/*.jar /app.jar

RUN ls -la /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
