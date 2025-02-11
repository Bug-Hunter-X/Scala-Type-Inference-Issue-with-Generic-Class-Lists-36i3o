```scala
class MyClass[T](val value: T) {
  def getValue: T = value
}

object Main extends App {
  val myInt = new MyClass(10)
  val myString = new MyClass("hello")

  println(myInt.getValue) //Prints 10
  println(myString.getValue) //Prints hello

  val myList:List[MyClass[_]] = List(myInt, myString) //Error: Type mismatch
}
```