# Topic: *Structural Design Patterns*

## Author: Grama Alexandru

----

## Objectives:

* Study and understand the Creational Design Patterns.
* Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms.
* Implement some additional functionalities, or create a new project using structural design patterns.

## Main tasks:
* Choose an OO programming language and a suitable IDE or Editor (No frameworks/libs/engines allowed).

* Select a domain area for the sample project.

* Define the main involved classes and think about what instantiation mechanisms are needed.

* Based on the previous point, implement at least 2 creational design patterns in your project.



## Theory:
&ensp; Structural design patterns are a category of design patterns that focus on the composition of classes and objects to form larger structures and systems. They provide a way to organize objects and classes in a way that is both flexible and efficient, while allowing for the reuse and modification of existing code. Structural design patterns address common problems encountered in the composition of classes and objects, such as how to create new objects that inherit functionality from existing objects, how to create objects that share functionality without duplicating code, or how to define relationships between objects in a flexible and extensible way.
## Implementation
__Decorator Pattern__

* __Class: LimitedEditionShoeDecorator__ 
* This class extends __ShoeDecorator__ and is used to add new behaviors to Shoe objects dynamically. It overrides the toString() method to add the "Limited Edition" label to the shoe description.
* __Code: Example__
```java
public class LimitedEditionShoeDecorator extends ShoeDecorator {
    // ... (Constructor)
    @Override
    public String toString() {
        return super.toString() + " [Limited Edition]";
    }
}
```

__Proxy Pattern__

* __Classes: BuyingServiceProxy__
* This class implements __BuyingServiceInterface__ and controls the access to the BuyingService. It is used to add an additional layer of control over the interaction with the buying service, such as logging, access control, lazy initialization, etc.* 
* __Code: Example__
```java
public class BuyingServiceProxy implements BuyingServiceInterface {
    private final BuyingService buyingService;
// ... (Constructor and other methods)
```
__Composite Pattern__

* __Class: CustomerGroup__
* This class implements __CustomerComponent__ and is used to compose objects into tree structures to represent part-whole hierarchies. It allows individual customers and groups of customers to be treated uniformly.
* __Code: Example__
```java
public class CustomerGroup implements CustomerComponent {
    private final List<CustomerComponent> customers = new ArrayList<>();
    // ... (Other methods)
}
```
__Adapter Pattern__

* __Class: DiscountAdapter__
* This class is used to make incompatible interfaces compatible. It wraps the Discount class and adapts its interface to be usable with the __SpecialOnlineBuyer__ class.
* __Code: Example__
```java
public class DiscountAdapter {
    private final Discount discount;
    // ... (Constructor and other methods)
    public void apply(SpecialOnlineBuyer buyer, double discountPercentage) {
        discount.applyDiscount(buyer.getName(), discountPercentage);
    }
}
```

## Output:
```
Customer{name='Jessica Ramirez', email='jessicaR89@gmail.com'} chose Shoe{brand='New Balance', size=41, type='sports', price=115.0, stockCount=10}
Jessica Ramirez bought a Shoe{brand='New Balance', size=41, type='sports', price=115.0, stockCount=10} in-store.
Stephanie O'Connor received notification: New shoes have arrived!
Alex Johnson received notification: New shoes have arrived!
Jessica Ramirez received notification: New shoes have arrived!
Benjamin Lee received notification: New shoes have arrived!
Available Shoes:
Shoe{brand='Nike', size=42, type='sports', price=120.0, stockCount=10}
Shoe{brand='Adidas', size=42, type='sports', price=125.0, stockCount=10}
Shoe{brand='Puma', size=44, type='sports', price=130.0, stockCount=10}
Shoe{brand='New Balance', size=41, type='sports', price=115.0, stockCount=10}
```


## Conclusions 
&ensp; The world of software engineering is intricately laced with challenges that revolve around scalability, maintainability, and adaptability of applications. In this context, design patterns like Decorator, Proxy, Composite, and Builder stand out as invaluable assets, each offering unique solutions tailored to specific structural and creational challenges.

The Decorator pattern excels in adding new responsibilities to objects dynamically without altering their structure. This form of flexibility is crucial in scenarios where class inheritance is impractical. By allowing objects to be decorated with new features at runtime, developers can achieve a high degree of customization and complexity in a controlled and manageable manner.

The Proxy pattern, in its essence, acts as a surrogate or placeholder, controlling the access to another object. Whether it’s a need for lazy initialization, logging, access control, or a myriad of other use cases, the Proxy pattern emerges as a robust mechanism to introduce an intermediate layer for enhanced control and security, ensuring that the underlying object is accessed and utilized optimally.

In contrast, the Composite pattern focuses on simplifying complex structures. By allowing individual objects and compositions of objects to be treated uniformly, it promotes a hierarchical, tree-like structure, making the whole system easier to work with and understand. It’s a cornerstone in GUI libraries and intricate hierarchy systems where simplicity and uniformity are paramount.

Lastly, the Builder pattern addresses the creational challenges associated with objects that have a large number of parameters. By providing an API for constructing an object step-by-step, it introduces clarity, flexibility, and control in the creation process. This is especially invaluable in scenarios where objects have optional and mandatory parameters, ensuring that the object’s construction is both comprehensive and intuitive.

In the final analysis, each of these design patterns emerges as a pillar that upholds the principles of efficient, clean, and modular code. While each is tailored to solve specific problems, their collective utilization can significantly enhance the structure and creation process in software design. By strategically applying these patterns, developers can weave applications that are not only robust and efficient but are also characterized by enhanced readability, maintainability, and scalability, hallmarks of exemplary software craftsmanship.
