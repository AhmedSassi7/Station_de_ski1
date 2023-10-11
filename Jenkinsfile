pipeline {
    agent any  

    stages {
        stage('Checkout') {
            steps {
                echo "Checkout stage: Passed"
            }
        }
        stage('Build and Test') {
            steps {
                sh 'ls -ltr'
                sh 'mvn clean package '  
            }
        }
        stage('Static Code Analysis') {
            environment {
                SONAR_URL = "http://127.0.0.1:9000"
            }
            steps {
                withCredentials([string(credentialsId: 'sonarqube', variable: 'SONAR_AUTH_TOKEN')]) {
                    sh 'mvn sonar:sonar -Dsonar.login=$SONAR_AUTH_TOKEN -Dsonar.host.url=${SONAR_URL}'
                }
            }
        }
        stage('Build and Push Docker Image') {
    environment {
        DOCKER_IMAGE = "oussamasaihi/ultimate-cicd:${BUILD_NUMBER}" 
    }
       steps {
        script {
            sh "docker build -t ${DOCKER_IMAGE} -f Dockerfile ."
            def dockerImage = docker.image("${DOCKER_IMAGE}")
            }
           }
         }
      }
    }

