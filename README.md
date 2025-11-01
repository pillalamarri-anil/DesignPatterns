# Design Pattens - Java

## Factory Design Pattern

### Simple Factory
It is not a GoF pattern. Creation of object moved to another class "Factory". Based an attribute factory class creates different objects.
### Factory Method
Factory class is made abstract and creation of object delegated to subclasses.

## Abstract Factory pattern
It is simply a factory of factory - related objects created together.
It provides an interface for creating families of related or dependent objects without specifying their concrete classes.
Client instantiates the Concrete Factory based on some condition (eg: IOS / Anroid) All the objects created after that are guarnateed to be from same family. 

Example:
A client wants to create iOS or Android UI components at runtime based on the client’s operating system.
The creation logic for different UI elements (buttons, text fields, menus, etc.) should be abstracted from the client.
The client only interacts with the abstract factory interface, while the concrete factories (iOSFactory, AndroidFactory) handle platform-specific object creation.
Note: The inner factory (IOSComponentFactory / AnroidComponentFactory) are concrete factories. They are implemented not extended from abstract factory interface.

## Bridge pattern

If there are 2 or more dimensions we create bridge abstraction so that each can grow independently.

Example: 
There is shape interface which has concrete classes cube, cone etc.
There is painter interface which has basic painter and designer painter.
To create bridge b.w them, painter will hold shape object. while creating a painter object client has to set the shape object. ie. This painter is specific to shape.


## Builder patten

Use to create complex objects with different state / options / parameters.
It also can validate the object before it is being created.

## Chain of Responsibility pattern

Lets to chain the responsibility. Each object can choose to perform task or delegate to next object. Client sets what comes next 
for each object.

Each object in chain holds pointer to next handler. 

## Command pattern

Ability to store action as an object so that action can be stored, executed, undone.

## Composite pattern

When data is like tree, composite pattern lets group and individual object in same way.
There will be common interface for individual and composite object. In composite object implementation it will traverse it child nodes in recursive manner
to support the same action.

## Decorator pattern

Decorator lets to have add-ons to original object. The new object with add-ons is treated just like original object.
Add on class has is a and has a relation with original object.

## Facade pattern

Provides simple and single interface to complex subsystem. 

## iterator pattern

Lets you traverse the collection without exposing internal details of collection and also strategy.

Eg: we can have an interface of iterator with 2 concrete implementations one for DFS one for BFS.

## Mediator pattern

Different objects does not talk to each other directly. Instead all communication happens over mediator.
Mediator can be used for broadcasting the message or having one to one conversion. If it is used for one to one conversion,
the receiver object is not used directly to mediator, as this violates the main purpose of mediator patten.
instead name or objectId used to specify receiver.

## Memento patten

Remembering (protect and storing) internal state of object without exposing its internal details.

Memento is light weight object tha contains information about state. Whenever state is stored / restored memento is applied.

## Observer pattern

Observer patten lets change in data of subject is automatically updated to all the observers

## Prototype pattern 

Using prototype pattern we can clone an existing object rather than creating a new one.

Every object implements copy (or clone) interface. When clone or copy called on base class its the derived
object that is being closed.

## Proxy pattern

It gives ability to create proxy object to original object. This is used to 
        Enable lazy loading -> Proxy loads the object only if it is necessary
        Control access to real object -> Proxy gives access only if authenticated.
        Cache data -> Proxy caches the data once loaded.

## Registry pattern

Registry stores the objects of different subclasses against its type. When we want to create new object of particular type it clone
of that particular object stored in registry and returns.

## Singleton pattern

Makes sure only one object of it is present for entire application.

## State pattern

Object behavior changes at runtime dynamically when internal state of object changes.
The concrete class implementing the state knows to which state to change based on action being called.
Example: ATM machine.. The behavior changes with the state.. like idle, card inserted, In-progress etc.
ATM class holds state object. different states are concrete classes implemented from state interface.

## Strategy pattern

Used when there are different ways for an action. Client wants to choose particular algorithm at runtime

Eg: Finding the route in google maps. When user select the mode of transport, the algorithm to find the route 
has to be changed at runtime. Generatlly this comes along factory pattern.

## Template pattern

Abstract class containing template method defines skeleton or common behaviors. Template method is a collection of smaller methods.
Derived classes can define their own behavior for each sub method. The template method that contains skeleton is FINAL (not implemented by derived classes).

## Visitor pattern

To add extra functionality, instead of modifying the class, we will have visitor that gets necessary data from the object.
For each new functionality, there will be a concrete visitor class (Eg: InventoryVisitor, PriceVisitor)
Each object to which we want to add extra functionality will implement method to accept the visitor.
For client the implementation is like object.accept(functionalityVisitor);






