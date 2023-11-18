pipeline {


    agent any
    stages {
        stage ('GetProject') {
            steps {
                git 'https://github.com/annclardner/annspetition.git'
            }
        }
        stage ('build') {
            steps {
                sh 'mvn clean:clean'
                sh 'mvn dependency:copy-dependencies'
                sh 'mvn compiler:compile'
            }
        }

        stage ('Exec') {
            steps {
                sh 'mvn exec:java'
            }
        }
    }
}
