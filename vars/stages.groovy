def call(String stageName){
  
  if ("${stageName"} == "Build")
  {
  sh "mvn clean package"
  }
  else if ("${stageName}" == "SQ Report")
  {
    sh "mvn clean sonar:sonar"
  }
  else if ("${stageName}" == "ArtifactToNexus")
  {
    sh "mvn clean deploy"
  }
}
