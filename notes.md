## Java Funaamentals

### Java Classes vs Objects
- Classes like blueprints
  - set up structure 
  - define what it is and what it can do
  - methods - functionality of your class/project
  - fields/members - store information/data
- Vehicle example
  - The class 
    - Can have wheels
    - Can drive
    - Number of seats

### Terms
- field - property on a class like numWheels
- primitive - types like int, double, float, character
- class - complex types including String, custom classes, capitalized naming convention
- object - an instance of the class, create objects with the "new" keyword

### Strings vs Characters
- characters use single quotes
- strings used double quotes
- That's because in Java, they are distinct types
- Characters are primitive type and strings are objects

## OOP Pillars
- Encapsulation
  - encapsulating related fields/methods into one class/object
  - Think of carrying groceris one by one or in bags
  - protecting access to our fields using private fields and public getters/setters

## The Object Class
- There is a class called "Object"
  - Not to be confused with classes and objects
- This is a blue print for all objects in Java to adhere to
  - Every single class you create will inherit from the Object class
    - Which makes sense because every time we use the new keyword, we are creating an object
    - In other words, it would be impossible to create a class, make an instance of that class, and have that not be considered an object
    - Every time we instantiate a class, we are making an object
- .toString
  - default implementation is to just print out the class and the weird memory stuff
  - but if we override the toString method, we can design our own String conversion for the object
- .equals - 
  - default implementation is to check the reference rather than the individual values
    - two different objects with the same values would be considered false
  - we can override .equals to make it check values

## .equals vs ==
- .equals is a method that is on the Object class
  - Every class we create will inherit this method but it is up to us to override so that it checks for values
  - By default .equals will check reference (are these objects literally the exact same object)
  - By default, .equals use ==
- == always checks for reference (not value)
  - because it's not a method, we can't override it so we can never change ==
- When in doubt, use .equals for classes
- With primitives, we have to use == because primitives don't have methods