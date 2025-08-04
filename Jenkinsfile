pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Jaisurya23/Jenkins_Java_sample.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn compile'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Publish Report') {
            steps {
                junit 'target/test-reports/*.xml'
            }
        }
    }
}
 
