/*
write a Java program to calculate compound interest for 3 year? 

 Formula-

Total amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));

Compound intrest = amount – principle;

Output:

Enter the principal amount (P): 25000

Enter the annual interest rate (R): 24

The compound interest after 3 years is: 22665.6
*/
//import required classes and/or packages
import java.util.*;
public class CompoundInterestCalculator {
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	////create Scanner object and read rate of interest and principal amount from the user
        System.out.print("Enter the Principal amount(P):");
        double p=sc.nextDouble();
        System.out.print("Enter the annual interest rate(R):");
        double r=sc.nextDouble();
        

        //close scanner
        double total_amount=p*((1+r/100)*(1+r/100)*(1+r/100));
        double compound_intrest=total_amount-p;
        
        //calculate compound interest based on formula
        
       System.out.println("The Compound interest after 3 years is:"+compound_intrest);
        // display compound interest
        
    }
}
