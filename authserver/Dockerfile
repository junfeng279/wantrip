FROM java:8-jre
MAINTAINER junfeng279 <junfeng279@163.com>

ADD ./target/authservice.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/authservice.jar"]

EXPOSE 5000