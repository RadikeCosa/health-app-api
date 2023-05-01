FROM openjdk:11
MAINTAINER Radike

COPY  target/healthAPI-0.0.1-SNAPSHOT.jar healthAPI-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/healthAPI-0.0.1-SNAPSHOT.jar"]

