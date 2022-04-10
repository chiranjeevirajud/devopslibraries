def call(String stageName){
  
  if ("$stageName") == "Build"
  {
  sh "mvn clean package"
  }
  if ("$stagaName") == "SQ Report"
  {
    sh "mvn clean sonar:sonar"
  }
  if ("$stageName") == "ArtifactToNexus"
  {
    sh "mvn clean deploy"
  }
}
