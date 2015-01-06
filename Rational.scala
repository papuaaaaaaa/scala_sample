class Rational(n: Int, d: Int) {
  require(d != 0)
  private val _num = n
  private val _denom = d
  println("created " + n + "/" + d )

  override def toString = n + "/" + d
  def num:Int = _num
  def denom:Int = _denom
}



