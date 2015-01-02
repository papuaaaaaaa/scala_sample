//mutable sequence
val numNames = Array("zero", "one", "two")
numNames(0) = "0"
numNames.foreach(println)

//imutable sequence
val names = List("zero", "one", "two")
names.foreach(println)
