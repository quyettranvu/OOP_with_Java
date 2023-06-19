# REVIEWS ABOUT BASICAL CONCEPTS OF OOP #
  * Abstraction: Abstraction is the process of simplifying complex systems by breaking them down into smaller, more manageable parts. In OOP, abstraction is achieved through the use of classes and interfaces, which define the structure and behavior of objects.
  * Encapsulation: Encapsulation is the practice of hiding the implementation details of an object from the outside world. This is usually done by making the internal state of an object private, and providing public methods (getters and setters) for accessing and modifying that state.
  * Inheritance: Inheritance is the process of creating new classes from existing ones. Inheritance allows you to define a new class that inherits all the properties and methods of an existing class, and can also add its own unique properties and methods.
  * Polymorphism: Polymorphism is the ability of an object to take on many forms. In OOP, polymorphism is achieved through method overriding and method overloading. Method overriding allows a subclass to provide its own implementation of a method that is already defined in its superclass, while method overloading allows multiple methods with the same name but different parameters to coexist in the same class.
  * Interfaces: Interfaces are like contracts that define a set of methods that a class must implement. Interfaces are useful for defining common behavior that can be shared across multiple classes.

Those implemetations can be carried out and handled with the help of classes and objects.

## SOME NOTES 
1/ The main difference between an abstract class and an interface is that an abstract class can have both abstract and non-abstract methods, while an interface can only have abstract methods.

Here are some other differences:

- An abstract class can have instance variables, while an interface cannot.
- An abstract class can have a constructor, while an interface cannot.
- A class can inherit from only one abstract class, but can implement multiple interfaces.
- An abstract class can provide some default implementation for its methods, while an interface cannot. (no concrete methods - those will be defined concretely in class where implement it)
- An abstract class is meant to be subclassed, while an interface is meant to be implemented.
- In general, we use an abstract class when we want to provide a common implementation for a set of related classes, and we use an interface when we want to define a common set of methods that a set of unrelated classes should implement.
- Child class inherit abstract class can be assigned as an abstract class but in contrast not compatible (abstract class can not be assigned as a child class).
- Abstract class can not be initialized and must be initialized with the help of children classes(inherit it), also if abstract class has a constructor then every children class is initialized will be at first set and call this constructor.



