object IfElseDemo {
  def main(args: Array[String]): Unit = {
    val x = 0;
    val y = 60;
    var res = "";
    if (x == 20) {
      res = "x = 20"
    }
    else {
      res = "x != 20"
    }
    println(res)

    val v = if (x == 20) 20 else "anythingelse"
    println(s"x is $v")

    if (x == 20 && y ==60){
      print("And operator")
    }
  }
}
