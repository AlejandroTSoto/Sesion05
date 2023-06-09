pipeline {
  agent any

  tools {
    // Nombre dado a la instalación de Maven en "Tools configuration"
    maven "maven default"
  }

  stages {
    stage('Git fetch') { 
      steps {
        // Get some code from a GitHub repository
        git branch: 'main', url: 'https://github.com/AlejandroTSoto/Sesion05asm978'
      }
    }
    stage('Compile, Test, Package') { 
      steps {
        // When necessary, use '-f path-to/pom.xml' to give the path to pom.xml
        // Run goal 'package'. It includes compile, test and package.
        sh "mvn  -f pom.xml clean package" 
      }
      post { 
        // Record the test results and archive the jar file.
        success {
          junit '**/target/surefire-reports/TEST-*.xml'
          archiveArtifacts '**/target/*.jar'
          jacoco(execPattern: '**/target/jacoco.exec',classPattern: '**/target/classes',sourcePattern: '**/src/',exclusionPattern: '**/test/')
          publishCoverage adapters: [jacocoAdapter('**/target/site/jacoco/jacoco.xml')] 
        }
      }
    }
    stage ('Analysis') {
      steps {
	    // Warnings next generation plugin required
	    sh "mvn -f pom.xml site"
      }
      post {
        success {
          dependencyCheckPublisher pattern: '**/target/site/dependency-check-report.xml'
          recordIssues enabledForFailure: true, tool: checkStyle()
          recordIssues enabledForFailure: true, tool: pmdParser()
          recordIssues enabledForFailure: true, tool: cpd()
          recordIssues enabledForFailure: true, tool: findBugs()
          recordIssues enabledForFailure: true, tool: spotBugs()
        }
      }
    }
    stage('Analyze Issues') {
      steps {
        // Ejecutar el plugin Warnings Next Generation
        sh "mvn -f pom.xml site"
      }
      post {
        success {
          // Publicar los resultados del plugin Warnings Next Generation
          warningsNgParser consoleLogParsers: [[parserName: 'Java Warnings', pattern: '**/target/warnings.xml']], forensicsEnabledForFailure: true
        }
      }
    }
    stage ('Documentation') {
      steps {
	    sh "mvn -f pom.xml javadoc:javadoc javadoc:aggregate" 
      }
      post{
        success {
          step $class: 'JavadocArchiver', javadocDir: 'sesion07Maven/target/site/apidocs', keepAll: false 
          publishHTML(target: [reportName: 'Maven Site', reportDir: 'sesion07Maven/target/site', reportFiles: 'index.html', keepAll: false]) 
        }
      }
    }
  }
}