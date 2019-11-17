FROM openjdk:8

COPY app.jar .

EXPOSE 8080

ENTRYPOINT ["java","-XX:+UnlockExperimentalVMOptions","-XX:+UseCGroupMemoryLimitForHeap","-jar","app.jar"]
