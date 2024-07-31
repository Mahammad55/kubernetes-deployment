FROM openjdk:17
COPY build/libs/kubernetes-deployment-0.0.1-SNAPSHOT.jar /app/
WORKDIR /app/
ENTRYPOINT ["java"]
CMD ["-jar", "/app/kubernetes-deployment-0.0.1-SNAPSHOT.jar"]
