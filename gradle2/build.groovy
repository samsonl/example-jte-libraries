void call(){
  println "gradle2a: build(${dev.long_name})"
}

void call(env){
  println "gradle2a: param build(${env.long_name})"
}
