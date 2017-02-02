node {
   def mvnHome
   stage('Preperation') { // for display purposes
      // Get some code from a GitHub repository
      echo('Heck, I shouldn\'t have to even check out code, but I could')
   }
   stage('Test') {
       echo('I should actually run the tests now.')
       sh('ls -ltra')
       sh('python app.py')
   }
   stage('Build') {
       echo('I should build a Docker image now.')
   }
   stage('Push') {
       echo('I should update the device now.')
   }
}
