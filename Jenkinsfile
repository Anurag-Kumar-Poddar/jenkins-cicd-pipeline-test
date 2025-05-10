pipeline {
    agent any

    tools {
        jdk 'JDK_21'             // This must match the name configured in Jenkins global settings
        maven 'Maven_3.9.9'      // Same here for Maven
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Anurag-Kumar-Poddar/jenkins-cicd-pipeline-test.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {
        success {
            echo 'Build and tests completed successfully!'
        }
        failure {
            echo 'Build failed. Please check the logs.'
        }
    }
}
