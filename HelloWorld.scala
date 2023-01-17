object HelloWorld {
  def main(args: Array[String]): Unit ={
    val name = "Vipul"
    val age = 24.5
    println("Hello, world!")
    println("Name is "+name+" and age is "+age)
    println(s"name is $name and age is $age")
    println(f"name is $name%s and age is $age%.2f")
    println("Hello, \nworld!")
  }
}
