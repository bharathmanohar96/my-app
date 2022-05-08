pipeline {
  agent any

  stages {
    stage('Maven Build') {
      steps {
        sh "echo jenkins demo"
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
