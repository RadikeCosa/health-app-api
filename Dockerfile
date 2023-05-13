FROM openjdk:11
MAINTAINER Radike

COPY  out/artifacts/healthAPI_jar/healthAPI.jar healthAPI.jar
ENTRYPOINT ["java","-jar","/healthAPI.jar"]

