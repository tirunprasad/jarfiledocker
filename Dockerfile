FROM tomcat:8.0.20-jre8
COPY target/JarFileDocker*.jar /usr/local/tomcat/webapps/jarfiledocker.jar

