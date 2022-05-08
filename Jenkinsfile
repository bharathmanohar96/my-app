pipeline {
  agent any

  stages {
    stage('Maven Build') {
      steps {
        sh "echo jenkins demo"
        sh "echo the job URL $JOB_URL"
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

}
