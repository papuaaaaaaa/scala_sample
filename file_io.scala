import scala.io.Source

def lengthOfLine(line:String) = line.length.toString.length

if (args.length > 0) {
  val lines = Source.fromFile(args(0)).getLines.toList
  val longestLine = lines.reduceLeft(
    (a, b) => if (a.length > b.length) a else b
  )
  val maxWidth = lengthOfLine(longestLine)
  lines.foreach((line:String) => println(" " * (maxWidth - lengthOfLine(line)) + line.length + " | " + line))

} else {
  println("Required one arguments.")
}