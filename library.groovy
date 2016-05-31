import groovy.json.*

@NonCPS
def parseJson(text) {
  return new JsonSlurper().parseText(text)
}

return this
