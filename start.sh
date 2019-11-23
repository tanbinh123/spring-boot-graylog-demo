#!/bin/bash

cd elasticsearch/

docker-compose up -d

sleep 1

cd ..

cd graylog/

docker-compose up -d

sleep 1

cd ..


