FROM openjdk:8
EXPOSE 8080
ADD target/itemsapi-1.war itemsapi-1.war
ENTRYPOINT ["java", "-jar","itemsapi-1.war"]
