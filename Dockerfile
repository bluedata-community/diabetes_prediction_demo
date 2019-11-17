FROM openjdk:8

COPY target/foo-1.0.0.BUILD-SNAPSHOT-exec.jar .

EXPOSE 8080

ENTRYPOINT ["java","-XX:+UnlockExperimentalVMOptions","-XX:+UseCGroupMemoryLimitForHeap","-jar","foo-1.0.0.BUILD-SNAPSHOT-exec.jar"]
