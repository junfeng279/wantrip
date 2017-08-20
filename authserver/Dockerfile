FROM java:8-jre
MAINTAINER junfeng279 <junfeng279@163.com>

ADD target/authserver.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/authserver.jar"]

EXPOSE 5000