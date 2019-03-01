def label = "worker-${UUID.randomUUID().toString()}"

podTemplate(label: label, serviceAccount: 'jenkins', automountServiceAccountToken: true, containers: [
  containerTemplate(name: 'maven', image: 'maven', command: 'cat', ttyEnabled: true),
  containerTemplate(name: 'docker', image: 'docker', command: 'cat', ttyEnabled: true),
  containerTemplate(name: 'kubectl', image: 'lachlanevenson/k8s-kubectl:v1.8.8', command: 'cat', ttyEnabled: true),
  containerTemplate(name: 'helm', image: 'lachlanevenson/k8s-helm:latest', command: 'cat', ttyEnabled: true)
],
volumes: [
  hostPathVolume(mountPath: '/home/gradle/.gradle', hostPath: '/tmp/jenkins/.gradle'),
  hostPathVolume(mountPath: '/var/run/docker.sock', hostPath: '/var/run/docker.sock')
]){

  node(label) {
    stage("build jar"){
      container()
    }

    stage('run kubectl') {
   //   git 'https://github.com/ClumsyPotato/GreetingsApp.git'
      container('kubectl') {
            sh 'kubectl create deployment woah --image=postgres'
	          sh 'kubectl get pods'
        // sh 'ls'
      }
    }
  }
}
























/*
def label = "maven-${UUID.randomUUID().toString()}"

podTemplate(label: 'label', containers: [
  containerTemplate(name: 'maven', image: 'maven:3.3.9-jdk-8-alpine', ttyEnabled: true, command: 'cat'),
   containerTemplate(name: 'kubectl', image: 'lachlanevenson/k8s-kubectl:v1.8.8', command: 'cat', ttyEnabled: true)
  ]) {

  node(label) {
    stage('run kubectl') {
      git 'https://github.com/ClumsyPotato/GreetingsApp.git'
      container('kubectl') {
          sh 'kubectl create deployment woah --image=postgresql -n jenkins'
        // sh 'ls'
      }
    }
  }
}
*/
