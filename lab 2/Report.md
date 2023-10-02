# Topic: *Creational Design Patterns*

## Author: Grama Alexandru

----

## Objectives:

* Study and understand the Creational Design Patterns.
* Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms.
* Use some creational design patterns for object instantiation in a sample project.

## Main tasks:
* Choose an OO programming language and a suitable IDE or Editor (No frameworks/libs/engines allowed).

* Select a domain area for the sample project.

* Define the main involved classes and think about what instantiation mechanisms are needed.

* Based on the previous point, implement at least 2 creational design patterns in your project.



## Theory:
&ensp; Creational design patterns are a category of design patterns that focus on the process of object creation. They provide a way to create objects in a flexible and controlled manner, while decoupling the client code from the specifics of object creation. Creational design patterns address common problems encountered in object creation, such as how to create objects with different initialization parameters, how to create objects based on certain conditions, or how to ensure that only a single instance of an object is created. There are several creational design patterns that have their own strengths and weaknesses. Each of it is best suited for solving specific problems related to object creation. By using creational design patterns, developers can improve the flexibility, maintainability, and scalability of their code.

## Implementation
__Singleton Pattern__

* __Class: BuyingService__ 
* The __BuyingService__ class follows the singleton pattern. This design pattern ensures that a class has only one instance and provides a global point of access to that instance. The BuyingService is made singleton to ensure that there is only one service instance throughout the application. It uses a private constructor and a static method that returns the singleton instance.
Thus, each class/component retains a single, focused responsibility.
* __Code: Example__
```java
public class BuyingService implements BuyingServiceInterface {
    private static BuyingService instance;

    private BuyingService() {}

    public static BuyingService getInstance() {
        if (instance == null) {
            instance = new BuyingService();
        }
        return instance;
    }
}
```

__Factory Pattern__

* __Classes: CustomerFactory, SportStoreFactory, StoreFactory__
* These classes provide interfaces for creating families of related or dependent objects without specifying their concrete classes. It abstracts the creation logic of customers and shoes.
* __Code: Example__
```java
public class CustomerFactory {
    public Customer createCustomer(String name, String email) {
        return new Customer(name, email);
    }
}   
```
__Abstract Factory Pattern__

* __Interface: StoreFactory__
* __Concrete Class: SportStoreFactory__
* The abstract factory pattern provides an interface to create families of related or dependent objects without specifying their concrete classes. In the code, __StoreFactory__ is the abstract factory interface with methods to create products (Customer and Shoe). __SportStoreFactory__ is a concrete class implementing this interface, ensuring that both the customer and the shoe created belong to the sports category or theme. It helps in maintaining object consistency across the application without relying on concrete classes.
* __Code: Example__

&ensp;&ensp;__Interface__
```java
public interface StoreFactory {
    Customer createCustomer(String name, String email);
    Shoe createShoe(String brand, int size, String type, double price, int stockCount);
}
```
&ensp;&ensp;__Concrete Class__
```java
public class SportStoreFactory implements StoreFactory {
    @Override
    public Customer createCustomer(String name, String email) {
        return new Customer(name, email);
    }

    @Override
    public Shoe createShoe(String brand, int size, String type, double price, int stockCount) {
        return new Shoe(brand, size, type, price, stockCount);
    }
}
```
__Adapter Pattern__

* __Class: ShoeBuilder__
* This class provides a way to construct a complex object step by step. It is used to create a Shoe object, allowing the client to specify the type, brand, size, price, and stock count with a fluent interface.
* __Code: Example__
```java
public class ShoeBuilder {
    private String brand;
    private int size;
    
    public Shoe build() {
        return new Shoe(brand, size, type, price, stockCount);
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
&ensp; In the intricate world of software design, patterns like Singleton, Factory Method, Abstract Factory, and Builder emerge as paramount for promoting efficient, clean, and modular code. Each possesses unique characteristics tailored to solve distinct challenges, yet they collectively contribute to the realization of robust software systems.

The Singleton pattern is esteemed for its capacity to restrict a class to a single instance, ensuring global accessibility and controlled resource usage. It is adept at eliminating redundancy, thereby conserving system resources and enhancing performance. However, its application is not without criticism, as overuse can lead to code that is difficult to test and extend.

On the other hand, the Factory Method pattern serves the creation process, delegating the instantiation of objects to subclasses. This approach fosters a separation of concerns and encapsulation, as creating objects is isolated from their use. It is particularly beneficial when the exact types of objects need to be decoupled from the client code.

The Abstract Factory pattern elevates this concept, offering a suite of factory methods to create a family of related or dependent objects without specifying their concrete classes. This pattern is instrumental in ensuring that created families of related objects work together seamlessly, promoting consistency across the application.

The Builder pattern shines in scenarios involving objects with a large number of parameters, some of which have defaults. It facilitates the creation of complex objects step by step, promoting code reusability and clarity. Unlike other creational patterns, Builder can construct differing representations of a product, which is quintessential for constructing intricate, multi-faceted objects.

In essence, these creational design patterns play an instrumental role in crafting adaptable, efficient, and maintainable software. The nuanced application of each, considering their strengths and constraints, can significantly augment the quality of software design and implementation. By selecting the appropriate pattern contextually, developers can navigate the complexities of object creation, fostering a codebase that is not only robust and efficient but also eloquent and scalable.

