node() {
  stage "Test"
  checkout scm
  def lib = fileLoader.fromGit('library.groovy', 'https://github.com/jacobfike/jenkins-pipeline-example.git', 'master', 'manimal-builder-ssh', '')
  def json = lib.parseJson(readFile('example.json'))
  echo "KEY: ${json.key}"
}
