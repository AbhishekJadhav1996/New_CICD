pipeline {
    agent any
      stages {
          stage ('build'){
              steps {
                  echo 'build done'
              }
          
          post {
                 always {
                     jiraSendBuildInfo site: 'abhisheknewjirasite.atlassian.net', branch: 'C2-3-Home-Page'
                 }
             }
          }
    }
}
