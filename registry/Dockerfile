FROM java:8-jre
MAINTAINER junfeng279 <junfeng279@163.com>

ADD ./target/registry.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/registry.jar"]

EXPOSE 8761