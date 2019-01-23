#!/bin/sh

ls
mvn clean install
mkdir ../artifact
ls target
cp target/*.jar ../artifact
ls ../artifact


