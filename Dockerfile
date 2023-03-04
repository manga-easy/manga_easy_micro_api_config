FROM openjdk:17-jdk-alpine
COPY build/libs/manga_easy_micro_api_config-0.0.1.jar micro-1.0.0.jar
EXPOSE 80
ENTRYPOINT ["java","-jar","micro-1.0.0.jar"]