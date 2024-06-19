FROM openjdk:23-slim

COPY proyecto-0.0.1-SNAPSHOT.jar /proyecto.jar

CMD ["java","-jar","/proyecto.jar"]