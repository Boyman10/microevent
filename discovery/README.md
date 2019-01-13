#Running the application through Docker

There is a docker file so you can build the application and run it in a container.

You should generate the jar first and issue the following commands :

$ docker build --file=Dockerfile.server --tag=discovery-server:latest --rm=true .

$ docker volume create --name=spring-cloud-config-repo

$ docker run --name=discovery-server --publish=8761:8761  --volume=spring-cloud-config-repo:/var/lib/spring-cloud/config-repo discovery-server:latest