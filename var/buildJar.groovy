#!/usr/bin/env groovy

def call(){
    echo "Building the project..."
    sh 'mvn package'
}
