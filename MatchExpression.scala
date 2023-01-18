object MatchExpression {
  def main(args: Array[String]): Unit = {
    val a = 12;
    var result = a match {
      case 1 => "wrong";
      case 12 => "correct"
    }
    println(result)
  }
}
