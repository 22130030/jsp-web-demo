FROM tomcat:9-jdk17

# Xóa app mặc định của Tomcat
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy WAR bạn build vào thư mục webapps
COPY target/*.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080
