import groovy.json.*

@NonCPS
def parseJson(text) {
  return new JsonSlurper().parseText(text)
}

def setup() {
    def json = parseJson(readFile('example.json'))
    env.NAMES = json.names
}

return this
