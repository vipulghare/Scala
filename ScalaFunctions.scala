object ScalaFunctions {
  object Math {
    def add(x: Int, y: Int): Int = {
      return x + y;
    }
    def subtract (x:Int , y:Int): Int ={
      x-y;
    }
    def divide (x:Int,y:Int): Int = x/y;
    def multiply (x:Int, y:Int):Int ={
      x*y;
    }
  }
def main(array: Array[String]): Unit = {
  println(Math.add(10,20));
  println(Math.subtract(10,20));
  println(Math.divide(20,10));
  println(Math.multiply(20,10));

}
}
