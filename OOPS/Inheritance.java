/*
 Inheritance is a process of obtaining the data members and methods from one class to another class plus have its own is known as inheritance.

 Subclass: child class/ derived class / inherited class  a class that inherites the other class 

 Super class is the parent class  whose features are inherited also known as base class 

 types of Inheritance 
 1. Single Level Inheritance 
 2. Mutiple level Inheritance
 3. Heirachy level Inheritance
 4. Multiple Inheritance (Interface) cause it is not supported by Java
 5. Hybrid Inheritance - Not Supported by Java

 Eg. all properties of a father is inherited by a son
 */
package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.setId(123); // Inherited from the super class
        dog.sound();
    }
}

/*
 * This is the parent class (also called as super class or base class)
 */
class Animal {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void sound() {
        System.out.println("By default, it is mute");
    }
}

/*
 * This is the child class / subclass which is Dog that inherits the properties of class Animal
 */
class Dog extends Animal {

    // Own behavior
    private void bark() {
        System.out.println("Dog " + getId() + " is barking");
    }

    // Override super class/parent class behavior
    @Override
    public void sound() {
        bark();
    }
}
