pipeline {
         agent {
                  label 'linux'
         }
         tools {
                  maven "Maven"
                  jdk "JDK11"
         }
         stages {
                  stage('Initialize'){
                           steps{
                                    echo "PATH = ${M2_HOME}/bin:${PATH}"
                echo "M2_HOME = /opt/maven"
            }
        }
                  stage('Validate'){
                         steps{
                           echo "VALIDATE"
                           bat "mvn validate"
                         }
                  }        
               stage('Compile'){
            steps{
                echo "COMPILE"
             bat "mvn compile"
            }
        }
stage('test'){
steps{
echo "Test"
bat "mvn clean test"
}
}
stage('Sonar Analysis') {
steps {
// use the SonarQube Scanner to analyze the project
withSonarQubeEnv('SonarQube') {
     bat 'mvn sonar:sonar'
