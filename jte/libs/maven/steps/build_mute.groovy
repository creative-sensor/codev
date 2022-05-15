void call(){
  println "maven: build()"
  stage("Build"){
    println "JTE: build OVERR"
  }
  stage("Analyze"){
    println "JTE: analyze OVERR"
  }
}

