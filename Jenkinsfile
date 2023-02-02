pipeline{
    agent any
    tools{
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
        
        stage('Compile'){
            steps{
                echo "COMPILE"
             bat "mvn clean install"
            }
        }
        
        stage('Sonar Analysis') {
            steps {
                // use the SonarQube Scanner to analyze the project
                withSonarQubeEnv('SonarQube') {
                    bat 'mvn sonar:sonar'
                }
            }
        }
        
        stage('Upload_Artifact') {
            steps {
                script{
                    def server = Artifactory.server 'artifactory'
                    def uploadSpec = """{
                    "files": [
                    {
                    "pattern": "target/*.jar",
                    "target": "CI_2_POC/"
                    }
                    ]
                    }"""
                    server.upload(uploadSpec)
                    }
                }
            }
        }
}
