void call(){
  println "gradle2a: build(${dev.long_name})"
}

void call(env){
  println "gradle2a: param build(${env.long_name})"
  println "gradle2a:2 ver build(${version})"
  println "gradle2a:2 config stuff build(${config.config_stuff})"
  println ">>> ${config.script}"
  res = Eval.me(config.script)
  println "RES : ${res}"
}
