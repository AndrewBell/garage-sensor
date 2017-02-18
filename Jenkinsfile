#!/usr/bin/env groovy

node {
    stage('Checkout') {
        git('https://github.com/AndrewBell/garage-sensor.git')
    }
    stage('Test') {
        sh('mvn test')
    }
    stage('Dockerize') {
        sh('docker build --tag recursivechaos/garage-sensor:latest .')
    }
    stage('Deploy') {
        sh('docker push recursivechaos/garage-sensor:latest')
    }
}
