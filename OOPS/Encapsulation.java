
/*
 Encapsulation is a process of wrapping of data and methods in a single unit is called encapsualtion. 
 this keeps the data safe from outside interface and misuse.

 Here, data and methods operating on that data will be wrapped  together in a single unit which is referred to as Class
In Encapuslation, variable of a class will be hidden from other classes and can be accessed only through methods of 
their current classes which is called Data hiding 

 */
package OOPS;

// below is the subclass
class Person {

   // given are the data members 
    private String name;
    private int age;
 //
    public String getName() { return name; }
 
    public void setName(String name) { this.name = name; }
 
    public int getAge() { return age; }
 
    public void setAge(int age) { this.age = age; }
}
 // main method or driver method
public class Encapsulation {
    public static void main(String[] args)
    { 
      // creating object from subclass and calling the differnet methods i.e setAge and setName
        Person person = new Person();
        person.setName("John");
        person.setAge(30);
 
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}