FROM openjdk:8
COPY target/hybrid-gcp-ccp-bigquery-app-0.0.1-SNAPSHOT.jar /hybrid-gcp-ccp-bigquery-app.jar
ENV JAVA_OPTS=""
#ENTRYPOINT ["java", "-jar", "/hybrid-gcp-ccp-bigquery-app.jar"]
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /hybrid-gcp-ccp-bigquery-app.jar" ]
