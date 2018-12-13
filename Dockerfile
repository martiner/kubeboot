FROM openjdk:8-alpine

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "kubeboot-0.0.1-SNAPSHOT.jar"]

COPY target/kubeboot-0.0.1-SNAPSHOT.jar /
