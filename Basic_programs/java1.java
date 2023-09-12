/*
Write a program to enter Principal, Rate and Time. Calculate and display Simple Interest and Amount.
Ask user to provide Principal amount, Interest rate in percentage and Time in years. Then calculate and display Simple interest and total amount.
Output:
Enter the Principal Amount: 25000
Enter the Rate of Interest (in percentage): 18
Enter the Time (in years): 2
Simple Interest: Rs 9000.0
Total Amount: Rs 34000.0
*/
import java.util.*;
public class SimpleInterestCalculator {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Principal Amount:");
        
        int p=sc.nextInt();
        System.out.println("Enter the Rate of Interest(in percentage):");
        
        int r=sc.nextInt();
        System.out.println("Enter the Time(in years):");
        
        int t=sc.nextInt();
        int si=(p*r*t)/100;
        System.out.println("Simple Interest:Rs"+si);
        
        int amount=p+si;
        System.out.println("Total Amount:Rs"+amount);
        
        
    }
}
