package OOPS;
/*
 call by reference changes made to the refernece affeects the original vlaue
 here adreess of actual variable are copied as a variable to the fucntion
 this method is preferred when we pass large amount of data to the function
 */
public class callbyrefernce {
    public static void change(String str) {
        str = "Goodbye";
    }
    public static void main(String args[]){
      String str1="Mohit";
      String str2="Raj";

      change(str1);
      change(str2);


      System.out.println("str2: "+str2);
      System.out.println("str1: "+str1);
    }
}
