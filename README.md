# Scala Type Inference Issue with Generic Class Lists

This example demonstrates a common type inference problem when working with lists of generic classes in Scala.  The compiler struggles to infer the appropriate type parameter `T` when the list contains objects with different types. The `List[MyClass[_]]` syntax attempts to work around the problem, but doesn't solve it.