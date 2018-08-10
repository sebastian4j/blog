FROM openjdk:alpine
RUN mkdir -p /usr/local/app/lib/
WORKDIR @project.build.directory@
ADD @project.build.finalName@.jar /usr/local/app/
COPY lib/ /usr/local/app/lib/
ADD run.sh /usr/local/app/
RUN chmod +x /usr/local/app/run.sh
CMD /usr/local/app/run.sh
