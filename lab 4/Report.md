# Topic: *Behavioral Design Patterns*

## Author: Grama Alexandru

----

## Objectives:

* Study and understand the Behavioral Design Patterns.
* As a continuation of the previous laboratory work, think about what communication between software entities might be involed in your system.
* Create a new Project or add some additional functionalities using behavioral design patterns.

## Main tasks:
* The implemented design pattern should help to perform the tasks involved in your system.
* The behavioral DPs can be integrated into you functionalities alongside the structural ones.
* There should only be one client for the whole system.


## Theory:
&ensp; Behavioral design patterns are a category of design patterns that focus on the interaction and communication between objects and classes. They provide a way to organize the behavior of objects in a way that is both flexible and reusable, while separating the responsibilities of objects from the specific implementation details. Behavioral design patterns address common problems encountered in object behavior, such as how to define interactions between objects, how to control the flow of messages between objects, or how to define algorithms and policies that can be reused across different objects and classes.
## Implementation
__Strategy Pattern__

* __Class: SpecialDiscountStrategy__ 
* This class implements the __DiscountStrategy__ interface to provide a specific implementation of the discount applying method. It allows the behavior of applying a discount to be selected at runtime. Different customers can have different discount strategies.
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

__Iterator Pattern__

* __Classes: ShoeCollection__
* This class provides a way to access the elements of a collection of shoes without exposing the underlying representation. It implements the Iterable interface for this purpose.
* __Code: Example__
```java
public class ShoeCollection implements Iterable<ShoeInterface> {
    private List<ShoeInterface> shoes;
    // ... (Constructor and other methods)
    @Override
    public Iterator<ShoeInterface> iterator() {
        return shoes.iterator();
    }
}
```
__Command Pattern__

* __Class: BuyCommand__
* This class encapsulates a buying command as an object, containing all the information about the action. This separates the responsibilities of issuing commands from performing commands, providing additional flexibility.
* __Code: Example__
```java
public class BuyCommand {
    private final CustomerComponent customer;
    private final ShoeInterface shoe;
    // ... (Constructor and other methods)
    public void executeOnline() {
        customer.buyShoeOnline(shoe);
    }
    public void executeInStore() {
        customer.buyShoeInStore(shoe);
    }
}
```
__Observer Pattern__

* __Class: ShoeStore__
* This class maintains a list of observers (customers) and notifies them whenever new shoes arrive. The observers can then perform specific actions upon receiving the notification.
* __Code: Example__
```java
public class ShoeStore {
    private List<CustomerComponent> observers = new ArrayList<>();
    // ... (Other methods)
    public void newShoesArrived() {
        for (CustomerComponent customer : observers) {
            ((Customer) customer).notify("New shoes have arrived!");
        }
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
&ensp; In the diverse landscape of software engineering, certain design patterns have carved out a niche for themselves, offering specialized solutions that address specific challenges in system design and behavior. The Strategy, Command, Observer, and Iterator patterns are exemplary in this regard, each contributing distinct methodologies to enhance flexibility, modularity, and communication in applications.

The Strategy pattern stands as a testament to the power of encapsulating algorithms and making them interchangeable. It provides a mechanism to define a family of algorithms, encapsulate each one, and make them interchangeable, thus allowing the client to choose the appropriate algorithm at runtime. This level of flexibility in selecting operations not only fosters adaptability but also aids in mitigating the complexities associated with conditional statements and enhances the testability of the code.

In the realm of behavioral patterns, the Command pattern emerges as a robust methodology for encapsulating requests as objects, thereby allowing for parameterization and queuing of requests, and providing additional functionalities such as log, undoable operations. It decouples the sender and receiver, promoting a level of abstraction that aids in the development of modular, extensible, and maintainable software.

The Observer pattern plays a pivotal role in implementing distributed event handling systems. It defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. This pattern is instrumental in building systems where the state of one object influences the state of others, ensuring synchronicity and consistency.

The Iterator pattern, on the other hand, provides a systematic and efficient way to traverse a container of objects without exposing the underlying complexities of the container. It plays a crucial role in offering a uniform interface for iterating over different collection types, thus promoting code reusability and algorithm decoupling.

Collectively, these design patterns underscore the necessity of abstraction, encapsulation, and modularity. They exhibit the profound impact of well-structured design principles in enhancing the adaptability, maintainability, and efficiency of software applications. In a world where software systems are perpetually evolving and scaling, the strategic implementation of these patterns ensures that applications can not only withstand the test of time but can also evolve gracefully, meeting the ever-changing needs and demands of the technology landscape.