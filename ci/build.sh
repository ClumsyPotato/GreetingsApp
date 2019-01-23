#!/bin/sh

ls
mvn clean install
mkdir artifact
cp greetingsrepo/target*.jar artifact



