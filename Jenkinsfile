
// this guarantees the node will use this template
def label = "mypod-${UUID.randomUUID().toString()}"
podTemplate(label: label) {
    node(label) {
        stage('Run shell') {
            sh 'echo hello world'
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