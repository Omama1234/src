/**
 * Dynamic method dispatch is a mechanism in Java (and other object-oriented programming languages) where the method to be executed is determined at runtime, based on the object that invokes it. This mechanism enables polymorphic behavior, allowing different objects to respond to the same method call in different ways, based on their individual implementations of that method.

Here's how it works:

Inheritance and Method Overriding: Dynamic method dispatch relies on inheritance and method overriding. When a subclass inherits a method from a superclass, it can provide its own implementation of that method, effectively overriding the superclass's implementation.
    Base Class Reference and Subclass Object: In dynamic method dispatch, you have a reference variable of a base class type that is used to refer to an object of a subclass. 
    For example, you might have a reference variable of type Animal that can refer to objects of various subclasses like Dog, Cat, etc.

    Method Invocation: When you invoke a method using this reference variable, the method that gets executed is determined by the type of object that the reference variable is pointing to, rather than the type of the reference variable itself. 
    This means that even though the reference variable is of the base class type, the actual method implementation that gets executed is from the subclass type that the object belongs to.
    
    Here's a simple example to illustrate dynamic method dispatch:
 */

 class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class  DynamicMethodDispatch {
    public static void main(String[] args) {
        Animal animal1 = new Dog(); // Reference variable of type Animal, but object of type Dog
        Animal animal2 = new Cat(); // Reference variable of type Animal, but object of type Cat
        
        animal1.makeSound(); // Calls makeSound() of Dog class
        animal2.makeSound(); // Calls makeSound() of Cat class
    }
}

/**
 * In this example, even though animal1 and animal2 are of type Animal, 
 * the makeSound() method called on them will execute the appropriate implementation based on the actual type of the object they refer to 
 * (Dog or Cat). This is dynamic method dispatch in action
 */



/** OUTPUT : 
 * Dog barks
 * Cat meows
 *  
 */ 