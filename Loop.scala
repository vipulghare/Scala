object Loop {
  def main(args: Array[String]): Unit = {
    var x = 10;
    var y = 0;
    while (x < 15) {
      print("x is " + x + "\n")
      x = x + 1;
    }
    while (y < 15) {
      print("y is " + y + "\n")
      y = y + 1;
    }

      for (i <- 1 to 5){
      println(i)
      }
    val lst = List("abc","xyz","gfs","dsf","DASF","ASSA","asasd")
    for (i <- lst){
      println(i)
    }
    val lst2 = List("abc", "xyz", "gfs", "dsf", "DASF", "ASSA", "asasd")
    for (j <- lst2) {
      println(j)
    }
    val sqlist = for {i <- 1 to 6} yield {
      i * i
    }
    println(sqlist)
  }
}
