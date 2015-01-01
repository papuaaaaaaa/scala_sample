//procedural
var filename = "default.txt"
if (!args.isEmpty)
  filename = args(0)
println(filename)


//functional
println(if (args.isEmpty) "default.txt" else args(0))
