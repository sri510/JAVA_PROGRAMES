/*
Write a program in java to input number of days. Find and display number of years, months, and days.
Output:
Enter the number of days: 397
Years: 1
Months: 1
Days: 2
*/
import java.util.*;

public class DaysToYearsMonthsDays {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        // Create a Scanner object to read user input
    System.out.println("Enter the number of days:");
    int no_days=sc.nextInt();
        // Prompt the user to enter the number of days
          int years= no_days/365;
        // Calculate the number of years
           int months=(no_days%365)/30;
           

        // Calculate the number of months
          int days=(no_days%365)%30;

        // Calculate the number of days
        
          System.out.println("Years:"+years);
          System.out.println("Months:"+months);
          System.out.println("Days:"+days);

        
    }
}
