FROM markhobson/maven-chrome:jdk-8

WORKDIR /app

COPY pom.xml ./pom.xml

COPY src ./src

CMD ["mvn", "clean", "test", "allure:serve"]