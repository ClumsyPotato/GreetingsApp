/*
podTemplate(label: 'mypod', containers: [
    containerTemplate(name: 'git', image: 'alpine/git', ttyEnabled: true, command: 'cat'),
    containerTemplate(name: 'maven', image: 'maven:3.3.9-jdk-8-alpine', command: 'cat', ttyEnabled: true),
    containerTemplate(name: 'docker', image: 'docker', command: 'cat', ttyEnabled: true)
  ],
  volumes: [
    hostPathVolume(mountPath: '/var/run/docker.sock', hostPath: '/var/run/docker.sock'),
  ]
  ) {
    node('mypod') {
        stage('Check running containers') {
            container('docker') {
                // example to show you can run docker commands when you mount the socket
                sh 'hostname'
                sh 'hostname -i'
                sh 'docker ps'
            }
	}
    }
}

/*

node('jenkinsworld'){
    sh "echo hello"
    sh "sleep 60"
}


*/


def label = "maven-${UUID.randomUUID().toString()}"

podTemplate(label: label, containers: [
  containerTemplate(name: 'maven', image: 'maven:3.3.9-jdk-8-alpine', ttyEnabled: true, command: 'cat'),
   containerTemplate(name: 'kubectl', image: 'lachlanevenson/k8s-kubectl:v1.8.8', command: 'cat', ttyEnabled: true)
  ]) {

  node(label) {
    stage('run kubectl') {
      git 'https://github.com/ClumsyPotato/GreetingsApp.git'
      container('kubectl') {
          sh 'kubectl get pods'
      }
    }
  }
}

*/

/*

def label = "maven-${UUID.randomUUID().toString()}"

podTemplate(label: label, containers: [
  containerTemplate(name: 'maven', image: 'maven:3.3.9-jdk-8-alpine', ttyEnabled: true, command: 'cat')
  ]) {

  node(label) {
    stage('Build a Maven project') {
      git 'https://github.com/ClumsyPotato/GreetingsApp.git'
      container('maven') {
          sh 'mvn clean package'
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
