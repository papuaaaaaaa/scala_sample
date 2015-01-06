class Rational(n: Int, d: Int) {
  require(d != 0)
  println("created " + n + "/" + d )
  override def toString = n + "/" + d
}



