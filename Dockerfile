FROM java:8
COPY GreetingsApp-*.jar .
#COPY target/GreetingsApp-0.0.1-SNAPSHOT.jar .
CMD ["java","-jar", "app.jar"]
