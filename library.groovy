import groovy.json.*

@NonCPS
def parseJson(text) {
  return new JsonSlurper().parseText(text)
}

def setup() {
    def json = parseJson(readFile('example.json'))
    echo "NAMES: " + json.names
}

return this
