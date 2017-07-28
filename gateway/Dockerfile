FROM java:8-jre
MAINTAINER junfeng279 <junfeng279@163.com>

ADD ./target/gateway.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/gateway.jar"]

EXPOSE 4000