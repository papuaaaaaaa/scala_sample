class test {
  private var count = 0
  def add(value:Int) { count += value }
  def currentCount:Int = count
}

val a = new test
a.add(10)
println(a.currentCount)
