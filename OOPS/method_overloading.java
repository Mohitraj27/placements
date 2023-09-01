/*
 Method overloading is one of the type of Compile Time Polymorphism  where in case of Method Overloading 
 if the class contains two or more methods having the same name and differnet parameters/arguments then it is method overloading


 Method Overloading : Same Method name but different paramters names or different parameters types
 */
package OOPS;

public class method_overloading {
    
   
    public static void main(String args[]){
     
    System.out.println(Adder.add(11,12));
    System.out.println(Adder.add(11,12,67));
    System.out.println(Adder.add(11.98,12.09));
    
    }
}
/**
 *  Adder
 */
 class  Adder {

  static double add(double a,double b){
    return a+b;
  }
 static int add(int a,int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }  
}
