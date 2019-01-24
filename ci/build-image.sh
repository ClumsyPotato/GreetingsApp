#!/bin/sh


ls ../maven-repo
mv ../maven-repo/* ../image-build
ls ./image-build
ls
cp Dockerfile ../image-build
ls ../image-build

