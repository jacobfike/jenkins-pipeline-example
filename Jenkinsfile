node() {
  stage "Test"
  checkout scm
  def lib = load('library.groovy')
  def json = lib.parseJson(readFile('example.json'))
  echo "KEY: ${json.key}"
}
