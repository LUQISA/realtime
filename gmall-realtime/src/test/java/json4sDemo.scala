import org.json4s.JsonAST.JValue
import org.json4s.jackson.JsonMethods

object json4sDemo {
  def main(args: Array[String]): Unit = {
    val s:String  =
    """
      |{"name":"list","age":20}
      |
    """.stripMargin


    val name:JValue = JsonMethods.parse(s) \"name"
    println(name)

  }



}
