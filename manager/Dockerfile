FROM java:8-jre
MAINTAINER junfeng279 <junfeng279@163.com>

ADD target/manager.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/manager.jar"]

EXPOSE 8082