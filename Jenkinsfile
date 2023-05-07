#!/usr/bin/env groovy

pipeline {
    agent any
    tools{
        maven 'maven-3.8.6'
    }
    stages {
        stage('build') {
            steps {
                script {
                    echo "building the application..."
                    bat "mvn package"
                }
            }
        }
        stage('test') {
            steps {
                script {
                    echo "Testing the application..."
                }
            }
        }
        stage('deploy') {
            steps {
                script {
                    echo "Deploying the application..."
                    bat 'start /B /MIN java -jar target/com.inn.test-v1.jar &'

                }
            }
        }
    }
}
