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

### Packages
- Packages are like the folder structure of the program
- If we have a complex app we could use packages to organize layers (Controller, Service, Repository)
- Also relevant when talking about access modifiers

### Terms
- field - property on a class like numWheels
- primitive - types like int, double, float, character
- class - complex types including String, custom classes, capitalized naming convention
- object - an instance of the class, create objects with the "new" keyword
- method - some repeatable functionality that has parameters and return types
  - parameters - inputs to the method
  - return type - what type of object is returned
- constructor - a special type of method that is used to create an object
- hashCode - integer representation of an object
- Object Class - the class that all classes in Java inherit from
- Inheritance - is-a relationship, inheriting fields/methods from parent
- overriding - changing up behavior of a method from parent class

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

## hashCode
- takes an object and converts it to an integer
- ex: car object -> 23644562
- Contrats/Contraints
  - For a given object, the hash code should be the same as long as we don't change any of the values that we check in .equals
    - For example, in our car class, a blue car, with 4 wheels, and a speed of 30 mph should always produce the same hash code unless we change any of those
    - If 2 different objects have the same values on the properties that are checked in. .equals, they should have the same hash code
    - 2 objects that are different don't necessarily need different hash codes in order for it to be valid
      - But, too many repetive hash values can decrease the efficieny of data structures
- Bad examples of hash-codes:
  - returning just the number of wheels because 2 cars with different colors but same num wheels would return the same hash code even though they are not the same car
  - returning a random number because the random-ness would violate the contract of 2 equal cars returning the same code 
- use case -> in complex data structures, we can use the hash-code to determine index
- [0...100], we could take our hashcode and apply some modulus 100 (take last 2 digits) and use that as in index
  - quick way of accessing index, assigning, retrieving
- Hash Functions are 
  - Irreversible - boiling down an object into a number
  - Consistent - same object will always produce the same hash code
- Passwords
  - Take password like "hello123", hash it => DWFNTFBDNGSN1323rt4gar and store that in the database
    - BEcause hash is irreversible, if a hacker got access to the database and tried to read the password, they would have no luck
    - Because hash is consistent, when we login with the password "hello123", we hash it and then check it against the hashed password
    - Libraries usually take care of this for you like BCrypt

## Methods
- some action that our objects can perform
- return type - which is what the method returns (String, int, void - no return)
- parameters - input to the method
- body - the inside, the logic takes place

### Constructors
- a special kind of method that is used when the object is created
- Always have the same name as the class
- We usually have to define a constructor before we can use it
  - Exception - if we do not define any constructors for a class, Java will automatically give us a default constructor
  - If we want a more interesting constructor, we have to define it ourselves

## OOP Pillars
### Encapsulation
  - encapsulate/package all of an entity's fields into one class
  - private fields (private means we can only access those from inside of the class)
  - public getters/setters (public means we can access these from anywhere in the entire program)
  - Controlling how the fields can be manipulated

### Polymorphism
#### Overloading
- Compile-Time Polymorphism
- Overloading allows us to define the same method name with different parameters
- I think of "overloading" in the sense of overloading the parameters because there are too many
  - Different could mean many things
    - different number of parameters
    - different types of parameters
    - different types of parameters

#### Overriding
- Run-Time Polymorphism

### Inheritance
- Having parent-child relationships in our code
- For example, the Object class is a parent (or a grandparent, or great...) to all classes in Java
  - What this means is that anything from the Object class, we have in our class (.toString, .equals)
- super keyword - lets us access stuff from parent
  - super.field
  - super.method()
  - super() - call the constructor
- Override - take something from the parent class and we change it, usually by making it more specific to the child class
- Override - re-writing a method for the child class
- Inheritance is useful for creating is-a relationships
  - Dog is an animal
  - Car is a vehicle
  - pizza is a food

### Abstraction


## Access Modifiers (From most accessible to least accessible)
- public - anywhere in the program (no matter what package)
- protected - can be accessed from the same package or from a sub-class (even if the sub-class isn't in the package)
- default access - if you don't write an access modifier, the default level of access if just from anywhere in the package (same folder)
- private - only from that class