#!/usr/bin/env groovy

def call(){
    echo "Building Docker image..."
    withCredentials([usernamePassword(credentialsId:'dockerhub-credentials',passwordVariable: 'PASS',usernameVariable:'USER')]){
        sh 'docker build -t yashpatil16/myapp:latest .'
        sh "echo $PASS docker login -u $USER -password-stdin"
        sh 'docker push yashpatil16/myapp:latest'
    }
}