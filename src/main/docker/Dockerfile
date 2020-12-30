FROM carsharing/alpine-oraclejdk8-bash
VOLUME /tmp
ADD demo.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]