FROM amazoncorretto:21
ARG JAR_FILE=build/libs/practicalelk-3.0.0.jar

ADD ${JAR_FILE} praticaljava.jar
ENTRYPOINT ["java", "-jar" , "praticaljava.jar"]