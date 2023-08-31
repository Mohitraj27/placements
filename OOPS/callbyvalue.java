package OOPS;

/**
 * callbyvalue
 * changes made to copy of value donot effect the origianl value 
 * here values to the dummy varaibels are passed , we can't alter the values of actual variables through function calls
 */
public class callbyvalue {

    public static void add(int num){
        num+=10;
    }
    public static void main(String args[]){
 int num1=10;
 int num2=98;

 add(num1);
 add(num2);
 System.out.println("num 1 :"+num1);
 System.out.println("Num 2 :"+num2);
    }
}