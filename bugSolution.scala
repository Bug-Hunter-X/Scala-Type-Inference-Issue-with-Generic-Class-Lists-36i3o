```scala
class MyClass[T](val value: T) {
  def getValue: T = value
}

object Main extends App {
  val myInt = new MyClass(10)
  val myString = new MyClass("hello")

  println(myInt.getValue) //Prints 10
  println(myString.getValue) //Prints hello

  // Solution: Use a common supertype or explicitly define the type
  val myList: List[MyClass[Any]] = List(myInt, myString) 
  //Alternatively,  val myList = List(myInt, myString) //this will also work as the compiler will figure it out. 
  
  myList.foreach(item => println(item.getValue))
}
```