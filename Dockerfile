FROM openjdk:8

COPY target/db-demo-app-exec.jar .

EXPOSE 8080

ENTRYPOINT ] "java","-XX:+UnlockExperimentalVMOptions","-XX:+UseCGroupMemoryLimitForHeap","-jar","db-demo-app-exec.jar" ]

