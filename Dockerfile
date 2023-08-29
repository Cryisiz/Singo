FROM eclipse-temurin:17
EXPOSE 8080
ADD target/singo-sprintboot-images.jar singo-sprintboot-images.jar
ENTRYPOINT [ "java","-jar","/singo-sprintboot-images.jar" ]