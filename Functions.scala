object Functions {
  object Math {
    def +(x:Int = 20, y:Int = 10): Int={
      x+y
    }
  }
  def main(array: Array[String]): Unit = {
    println(Math.+())
    println(Math.+(40,30))
    println(Math.+(40))
    println(Math.+(30))
  }

}
