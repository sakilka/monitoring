FROM registry.ferratum.com/openjdk11-zulu:1.12.0.RELEASE

ADD monitoring-task/target/$JAVA_APP_JAR /deployments/

ENTRYPOINT ["java","-jar","/deployments/monitoring-task-1.0.0-BUILD-SNAPSHOT.jar"]