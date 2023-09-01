/*
 Polymorphism is the process of representing one form in multiple forms is known as Polymorphism

 Polymorphism allows to define one interface which have multiple implementations

 We can create functtions or refernce variables which behaves differently in a differnet programmic context
 */

package OOPS;

public class Polymorphism {
    
    public static void main(String args[]){
      CashPayment c=new CashPayment();
      c.pay();
      Payment p=new CashPayment();
      p.pay();
      
      p=new CreditPayment();
      p.pay();
        
    }

    /**
     * Payment
     */ 
    public interface Payment {
      void pay();
        

     
    }


    class CashPayment implements Payment{
        @Override
        public void pay(){
            System.out.println("This is cash payment");
        }
    }

    /**
     * Credit card is a payment type
     */
          class CreditPayment implements Payment {
    @Override
    public void pay(){
        System.out.println("This is credit card payment");
    }
        
    }
}
