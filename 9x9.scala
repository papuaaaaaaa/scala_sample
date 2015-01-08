def makeRowSeq(col:Int) = {
  for (row <- 1 to 9) yield {
    val prod = row * col toString
    val padding = " " * (3 - prod.length)
    padding + prod
  }
}

def makeRowString(col:Int):String = makeRowSeq(col).mkString

def makeTableString():String = {
  val tableSeq = for (col <- 1 to 9) yield makeRowString(col)
  tableSeq.mkString("\n")
}

println(makeTableString)
