pipeline {
  agent any

  stages {
    stage('Maven Build') {
      steps {
        sh "echo jenkins demo"
        sh "echo the job URL $JOB_URL"
      } 
    }
    Stage('tomcat deploy'){
      steps{
        sshagent(['tomcat-deploy']) {
         sh 'scp -o StrictHostKeyChecking=no target/*.war ec2-user@172.31.46.77:/home/ec2-user/tomcat8/webapps/app.war'
         sh 'ssh ec2-user@172.31.46.77 /home/ec2-user/tomcat8/bin/shutdown.sh'
         sh 'ssh ec2-user@172.31.46.77 /home/ec2-user/tomcat8/bin/shartup.sh'
      }
    }
  }
  post {
      success {
        echo "this is success"
      }
      failure {
        echo "this is failure"
      }
    }
  options {
      buildDiscarder logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '30', numToKeepStr: '4')
  }
}
}
