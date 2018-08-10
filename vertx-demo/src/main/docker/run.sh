#!/bin/sh
echo "********************************************************"
echo "lanzando hola-vertx"
echo "********************************************************"

cd /usr/local/app/
java -jar @project.build.finalName@.jar
