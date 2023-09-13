FROM openjdk:17
WORKDIR /opt
ENV PORT 8083
EXPOSE 8082
COPY target/*.jar /opt/tharak.jar
ENTRYPOINT exec java $JAVA_OPTS -jar tharak.jar
