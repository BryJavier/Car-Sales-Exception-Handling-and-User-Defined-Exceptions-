Using the same MP1 assignment you submitted, you will enhance the code by using user-defined exceptions and try catch-finally handling.

You will create a user-defined exception named InvalidDiscountException. You have to extend the Exception class. This will be triggered if the computed discount is more than 12%. 

 

abstract class ToyotaMotors {
     public abstract boolean isDiscountValid() throws InvalidDiscountException;
     public abstract double computeDiscount();
     

      //will only be computed if the transaction is valid. its output will be displayed during program termination

     public abstract double computeNetSales(); 
}
