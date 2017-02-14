# garage-sensor
Detects status of a switch

# To Test

`mvn test`

# To Run

`mvn spring-boot:run`

## To Build (with Jenkins)
Create a Jenkins pipeline pointing to `https://github.com/AndrewBell/garage-sensor.git`


### Some notes on building the whole thing from scratch

1. Setup Dev Environment
    1. Install Java
    1. Install Maven
    1. Install Docker
    1. Install Docker-Cloud
        1. [Configure](https://docs.docker.com/docker-cloud/getting-started/deploy-app/2_set_up/) docker-cloud cli
1. Checkout Repo
1. Run `sh ./build_docker.sh`
    * This builds the project with Maven, copies over the deployable artifacts, and builds a docker image.
1. Setup Raspberry Pi
    1. Install Docker `curl -sSL https://get.docker.com | sh`
1. Deploy to Pi
    1. SSH into your Raspberry Pi
    1. `docker pull recursivechaos/garage-sensor:latest`
