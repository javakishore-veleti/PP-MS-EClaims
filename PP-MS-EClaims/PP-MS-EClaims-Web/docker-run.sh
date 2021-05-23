#!/bin/bash

CURR_DIR=$(dirname $0)

APP_PORT_NO=8000
CONTAINER_NAME="PP-MS-EClaims-Web"

mkdir -p /tmp/provider-portal/ms-eclaims

docker run -d --name ${CONTAINER_NAME} -p ${APP_PORT_NO}:8080 provider-portal/ms-eclaims > /tmp/provider-portal/ms-eclaims/docker-container.log 2&>1

echo ""
echo "Provider Portal - EClaims Web URL -> http://localhost:${APP_PORT_NO}"
echo ""
echo "Docker commands are:"
echo "#####################"
echo "docker ps -a 	${CONTAINER_NAME}"
echo "docker stop 	${CONTAINER_NAME}	OR ./docker-stop.sh"
echo "docker rm 	${CONTAINER_NAME}	OR ./docker-remove.sh"
echo ""
