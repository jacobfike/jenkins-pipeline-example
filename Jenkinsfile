import groovy.json.*

@NonCPS
def parseJson(text) {
  return new JsonSlurper().parseText(text)
}


node() {
  stage "Test"
  checkout scm
  def json = parseJson(readFile('example.json'))
  echo "KEY: ${json.key}"
}
