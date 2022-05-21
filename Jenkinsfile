@Library('barrisharedlib') _
pipeline{
    agent any
    tools {
        maven 'mavenbuild'
    }
    options {
        buildDiscarder logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '30', numToKeepStr: '5')
    }
    triggers {
        pollSCM ''
    }
    stages{
        stage('git checkout'){
            steps{
                git branch: 'develop', url: 'https://github.com/bharathmanohar96/my-app'
            }
        }
        stage('maven build'){
            steps{
                sh 'mvn clean package'
            }
        }
        stage('tomcat deply'){
            steps{
                tomcatcdci('172.31.34.253','apple','tomcatcredid')
            }
        }
    }
}
