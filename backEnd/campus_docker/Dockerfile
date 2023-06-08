FROM openjdk:17-oracle
ADD target/campus-docker.jar campus-docker.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "campus-docker.jar"]