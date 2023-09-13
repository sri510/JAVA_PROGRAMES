/*
A whole-seller gives incentives in the form of discounts on the net bill. Write a program to input the net bill and calculate the discount as follows:
   Net Bill in Rupees            Discount % 
       <5000                            5
       >=5000 and <10000        	10
       >=10000				15
       
Display Discount %, Discount Amount and Amount Payable
Output:
Enter Net Bill 8000
Discount Percentage: 10.0
Discount Amount: 800.0
Amount Payable: 7200.0
*/
import java.util.Scanner;

public class NetBillBasedOnDiscount {

	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
		// Create a Scanner object to read user input
		
		 System.out.println("Enter Net Bill: ");
		double netBill=sc.nextDouble();
		// Prompt the user to enter the amount of Net Bill
		if(netBill<5000)
		{
		    double discount=5;
		    double dis_amount=netBill*(discount/100);
		    double amount_pay=netBill-dis_amount;
		    System.out.println("Discount percentage:"+discount);
		    System.out.println("Discount Amount:"+dis_amount);
		    System.out.println("Amount Payable:"+amount_pay);
		}
		
		// Find discount percentage based on conditions
		
		if(netBill>=5000 || netBill<10000)
		{
		    double discount=10;
		    double dis_amount=netBill*(discount/100);
		    double amount_pay=netBill-dis_amount;
		    System.out.println("Discount Percentage:"+discount);
		    System.out.println("Discount Amount:"+dis_amount);
		    System.out.println("Amount Payable:"+amount_pay);
		}
		//Calculate Discount amount
		
		if(netBill>=10000)
		{
		    double discount=15;
		    double dis_amount=netBill*(discount/100);
		    double amount_pay=netBill-dis_amount;
		    System.out.println("Discount Percentage:"+discount);
		    System.out.println("Discount Amount:"+dis_amount);
		    System.out.println("Amount Payable:"+amount_pay);
		}

    }
}
