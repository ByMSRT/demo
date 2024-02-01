node{
stage('Get from git project')
  {
    git 'https://github.com/ByMSRT/demo'
  }
  
  stage('Compile then package')
  {
    sh 'mvn package'
  }
}
