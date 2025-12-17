pipeline {
    agent any
    tools {
        maven 'mejven'
    }
    stages {
        stage("pull") {
            steps {
                git url: 'https://github.com/Grzekszosz/webowa_java.git', branch: 'master'
            }
        }
        stage("build") {
            steps {
                // bat 'mvn clean package'
                sh 'mvn clean package'
            }
        }
    }
    post {
        success {
            archiveArtifacts 'target/*.war'
            sh 'cp target/*.war /home/kurs/wildfly-38.0.1.Final/standalone/deployments/'
        }
    }
}