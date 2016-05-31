import groovy.json.*

@NonCPS
def parseJson(text) {
  return new JsonSlurper().parseText(text)
}

def setup() {
    def json = parseJson(readFile('example.groovy'))
    return json.names
}

return this
