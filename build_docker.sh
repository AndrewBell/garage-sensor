#! /bin/bash
mvn clean install
docker build --tag recursivechaos/garage-sensor:latest .
docker push recursivechaos/garage-sensor:latest