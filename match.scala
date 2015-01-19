object MatchTest {
  def matchTest(x :Any) = {
    x match {
      case (_, _, _) => println("1=" + _ + ",2=" + _ + ",3=" + _ + ".")
      case _ =>
    }
  }
}
