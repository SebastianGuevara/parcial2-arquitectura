6a. Para correr el aplicatico de manera local usando una base de datos MySql se tendría que correr un contenedor de docker con una imagen de MySql.

Para esto hay que buscar la imagen de MySql en Docker hub la cual estaría en el siguiente link: https://hub.docker.com/_/mysql

Luego una vez teniendo esta imagen tiene que ejecutar el siguiente comando para desplegar un contenedor de docker con dicha image en el puerto 3306: "docker run -d -e MYSQL_ROOT_PASSWORD=clave -p 3306:3306 mysql:latest"

Cuando se hagan esto pasos el contendor con MySQL va a estar corriendo en el puerto 3306. -> localhost:3306

## DOCKER FILE

Primero llamamos la imagen openjdk:19-oracle

Despues copiamos el proyecto compilado con COPY build/libs/parcial-0.0.1-SNAPSHOT.jar /app

Continuamos exponiendo el puerto con EXPOSE 8080

Finalmente definimos el entrypoint con ENTRYPOINT ["java","-jar","/app"]

## Integrates

- Sebastián Gueara
- Juan Andrés Valderrama
