FROM mamohr/centos-java:latest

RUN yum update -y &&\
    yum install git -y

RUN git clone https://github.com/harshild/springboot-eureka-zuul.git &&\
    cd springboot-eureka-zuul &&\
    ./gradlew build -x test