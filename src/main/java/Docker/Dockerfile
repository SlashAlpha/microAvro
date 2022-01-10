FROM openjdk:17 as builder
WORKDIR application
#COPY maven/${project.build.finalName}.jar : /${project.build.finalName}.jar/
ARG JAR_FILE=*.jar
COPY ${JAR_FILE} MicroAvro-1.jar
#ADD maven/${project.build.finalName}.jar : /usr/local/${project.build.finalName}.jar/
RUN java -Djarmode=layertools -jar MicroAvro-1.jar extract

FROM openjdk:17



EXPOSE 8099





WORKDIR application
COPY --from=builder application/dependencies/ ./
COPY --from=builder application/spring-boot-loader/ ./
COPY --from=builder application/snapshot-dependencies/ ./
COPY --from=builder application/application/ ./
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "org.springframework.boot.loader.JarLauncher"]