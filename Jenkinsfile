node {
   def mvnHome
   stage('Preperation') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/AndrewBell/garage-sensor.git'
   }
   stage('Test') {
       echo('I should actually run the tests now.')
       sh('python app.py')
   }
   stage('Build') {
       echo('I should build a Docker image now.')
   }
   stage('Push') {
       echo('I should update the device now.')
   }
}
