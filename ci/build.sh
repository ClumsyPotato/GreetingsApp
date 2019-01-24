#!/bin/sh

ls
mvn clean install
mkdir ../target
ls target
cp target/*.jar ../target
ls ../target


