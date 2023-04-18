FROM openjdk:19-oracle

COPY build/libs/parcial-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app"]
