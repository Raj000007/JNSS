pipeline {
    agent any
    tools {
        maven "MAVEN_HOME"
    }
    
    environment {
  SNAP_REPO = 'snapshot'
  NEXUS_USER = 'admin'
  NEXUS_PASS = 'admin'
  RELEASE_REPO = 'release'
  CENTRAL_REPO = 'central'
  NEXUS_IP = '172.31.16.243'
  NEXUS_PORT = '8081'
  NEXUS_GRP_REPO = 'vpro-maven-group'
        NEXUS_LOGIN = 'nexuslogin'
    }

    stages {
        stage('Build'){
            steps {
                sh 'mvn -s settings.xml -DskipTests install'
            }
        }
    }
}
