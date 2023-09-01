/*
 Run time polymorphism means type of the object is determined at runtime 

 also runtime polymorphism is a process in which a call to an overridden method is resolved at runtime rather than compile-time
 */

package OOPS;

/**
 * Shape
 */
class Shape {
    void draw() {
        System.out.println("drawing...");
    }
}

class Rectangle extends Shape {
    Rectangle() { // Add a constructor
    }

    void draw() {
        System.out.println("drawing rectangle...");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("drawing Circle...");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("drawing Triangle...");
    }
}

public class Runttime_polymorphism {
    public static void main(String args[]) {
        Shape s;

        s = new Rectangle();
        s.draw();

        s = new Circle();
        s.draw();

        s = new Triangle();
        s.draw();
    }
}
