def max(x:Int, y:Int):Int = {
  if (x>y)
    x
  else
    y
}

def max2(x:Int, y:Int):Int = if (x>y) x else y

println(max(3,6))
println(max2(3,6))
