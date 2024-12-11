1. When all the element creation and its business logic at one place then we use this pattern.



## Use Cases of the Factory Method
Below are the main use cases of factory method design pattern:

Used in JDBC for creating connections and in frameworks like Spring for managing beans.
Libraries like Swing and JavaFX use factories to create flexible UI components.
Tools like Log4j rely on factories to create configurable loggers.
Factories help create objects from serialized data, supporting various formats.

## Advantages of the Factory Method
Below are the main advantages of factory method design pattern:

Separates creation logic from client code, improving flexibility.
New product types can be added easily.
Simplifies unit testing by allowing mock product creation.
Centralizes object creation logic across the application.
Hides specific product classes from clients, reducing dependency.

##Disadvantages of the Factory Method
Below are the main advantages of factory method design pattern:

Adds more classes and interfaces, which can complicate maintenance.
Slight performance impacts due to polymorphism.
Concrete creators are linked to their products.
Clients need knowledge of specific subclasses.
May lead to unnecessary complexity if applied too broadly.
Factory logic can be harder to test.