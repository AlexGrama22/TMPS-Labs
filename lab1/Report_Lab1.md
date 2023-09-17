# Topic: *SOLID Principles*

## Author: Grama Alexandru

----

## Objectives:

* Study and understand the SOLID Principles.
* Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms.
* Create a sample project that respects SOLID Principles.

## Main tasks:
* Choose an OO programming language and a suitable IDE or Editor (No frameworks/libs/engines allowed).

* Select a domain area for the sample project.

* Define the main involved classes and think about what instantiation mechanisms are needed.

* Respect SOLID Principles in your project.



## Theory:
&ensp; SOLID is a set of five object-oriented design principles intended to make software designs more maintainable, flexible, and easy to understand. The acronym stands for Single Responsibility Principle, Open-Closed Principle, Liskov Substitution Principle, Interface Segregation Principle, and Dependency Inversion Principle. Each principle addresses a specific aspect of software design, such as the organization of responsibilities, the handling of dependencies, and the design of interfaces. By following these principles, software developers can create more modular, testable, and reusable code that is easier to modify and extend over time. These principles are widely accepted and adopted in the software development community and can be applied to any object-oriented programming language.


## Implementation

&ensp; The Shoe Store Simulation demonstrates SOLID principles through its structure and design. In the MainApp, shoes are randomly selected for a customer who can purchase via different methods. The ShoeFactory provides a clear instance creation, adhering to the Factory pattern, a subset of the Single Responsibility Principle. The Customer class's purchase actions are modularized through the implementation of OnlineBuyer and InStoreBuyer interfaces, embracing the Interface Segregation Principle. This separation ensures that each class and interface has a distinct responsibility, making the system more maintainable and scalable.

## Output:
```
Alex Johnson chose Shoe{brand='Nike', size=42, type='sports', price=120.0, stockCount=10}
Alex Johnson bought a shoe in-store.

Benjamin Lee chose Shoe{brand='Adidas', size=40, type='sports', price=128.0, stockCount=12}
Benjamin Lee bought a shoe in-store.
```


## Conclusions / Screenshots / Results
&ensp; In crafting this Shoe Store Simulation, I've seen firsthand how the SOLID principles can streamline and enhance software design. By using the ShoeFactory for creating shoe instances, I've adhered to the Single Responsibility Principle, ensuring each class does one thing well. The introduction of OnlineBuyer and InStoreBuyer interfaces exemplifies the Interface Segregation Principle, allowing for flexibility in purchase methods without burdening the Customer class. Overall, these principles haven't just made the code more organized; they've made it intuitive and ready for future growth.


