def call(tomcatid,warname,credid){
  sshagent(["${credid}"]) {
      sh "scp -o StrictHostKeyChecking=no target/*.war ec2-user@${tomcatid}:/opt/tomcat8/webapps/${warname}.war"
      sh "ssh ec2-user@${tomcatid} /opt/tomcat8/bin/shutdown.sh"
      sh "ssh ec2-user@${tomcatid} /opt/tomcat8/bin/startup.sh"
    }
}
