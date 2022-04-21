pipeline {
	agent any
		stages {
			stage('Clean stage') {
				steps {
					dir("MiscTopicDemo") {
						bat 'mvn clean'
					}
				}
			}
			stage('Compile stage') {
				steps {
					dir("MiscTopicsDemo") {
						bat 'mvn compile'
					}
				}
			}
			stage('Install stage') {
				steps {
					dir("MiscTopicsDemo") {
						bat 'mvn install'
					}
				}
			}
		}
}