FROM maven:3.8.5 AS build
WORKDIR /app
ARG CONTAINER_PORT
COPY pom.xml /app
RUN mvn dependency:resolve
COPY . /app
RUN mvn clean
RUN mvn package -DskipTests -X

FROM openjdk
COPY --from=build /app/target/*.jar spring-boot-docker.jar
EXPOSE 8080
CMD ["java", "-jar", "spring-boot-docker.jar"]