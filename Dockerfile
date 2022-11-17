FROM openjdk
WORKDIR usr/lib
ADD ./target/dockerCustomerData-0.0.1-SNAPSHOT.jar /usr/lib/dockerCustomerData-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","dockerCustomerData-0.0.1-SNAPSHOT.jar"]