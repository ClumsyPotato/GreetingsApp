/*

node('jenkinsworld'){
    sh "echo hello"
    sh "sleep 60"
}

*/


def label = "maven-${UUID.randomUUID().toString()}"

podTemplate(label: label, containers: [
  containerTemplate(name: 'maven', image: 'maven:3.3.9-jdk-8-alpine', ttyEnabled: true, command: 'cat')
  ]) {

  node(label) {
    stage('Build a Maven project') {
      git 'https://github.com/ClumsyPotato/GreetingsApp.git'
      container('maven') {
          sh 'mvn  clean package'
      }
    }
  }
}


/*
pipeline {
    agent any


    stages {
        stage('Build'){
            steps{
                sh 'ls'
                echo 'i am doing even more stuff'
            }
        }
    }
}


*/