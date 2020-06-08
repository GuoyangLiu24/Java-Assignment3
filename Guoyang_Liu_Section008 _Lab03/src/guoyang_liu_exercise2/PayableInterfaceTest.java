// Fig. 10.14: PayableInterfaceTest.java
// Payable interface test program processing Invoices and 
// Employees polymorphically.
package guoyang_liu_exercise2;
public class PayableInterfaceTest {
   public static void main(String[] args) {
      Payable payable1; // = new Payable();
      Invoice invoice1 = new Invoice("01234", "seat", 2, 375.00);
      Invoice invoice2 = new Invoice("01235", "seat2", 4, 475.00);
      System.out.println(invoice1);
      System.out.println(invoice1.getPaymentAmount());
     // Interface polymorphism
      payable1 = invoice1;
      System.out.println(payable1); // ?
      System.out.println(payable1.getPaymentAmount()); //?
      
      payable1 = invoice2;
      System.out.println(payable1); // ?
      System.out.println(payable1.getPaymentAmount()); //?
      
	   
	   // create four-element Payable array
      Payable[] payableObjects = new Payable[] {
         new Invoice("01234", "seat", 2, 375.00),
         new Invoice("56789", "tire", 4, 79.95),
         new SalariedEmployee("John", "Smith", "111-11-1111", 800.00),
         new HourlyEmployee("Lisa", "Barnes", "222-22-2222", 14.00,8),
         new CommissionEmployee("Kevin", "Durant", "333-33-3333", 55000,0.1),
         new BasePlusCommissionEmployee("Steven", "Curry", "444-44-4444", 55000,0.1,200.0)
      };

      System.out.println(
         "Invoices and Employees processed polymorphically:"); 

      // generically process each element in array payableObjects
      for (Payable currentPayable : payableObjects) {
         // output currentPayable and its appropriate payment amount
         System.out.printf("%n%s %npayment due: $%,.2f%n", 
            currentPayable.toString(), // could invoke implicitly
            currentPayable.getPaymentAmount()); 
      } 
   } 
} 

