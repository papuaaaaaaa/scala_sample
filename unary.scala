class Test {
  def unary_!():String = "called original *"
}

val test = new Test
println(!test)

