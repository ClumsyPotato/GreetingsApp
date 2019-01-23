#!/bin/sh

ls
mvn clean install
mkdir artifact
cp target/*.jar artifact



