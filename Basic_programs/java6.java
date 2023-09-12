/*
Write a java program to find the profit and loss by following the formula

Profit and loss Formulas – 

Profit = SP – CP

Loss = CP – SP

Profit percentage = (Profit /Cost Price) x 100

Loss percentage = (Loss / Cost price) x 100
*/
import java.util.*;
public class ProfitAndLoss {

	public static void main(String[] args) {
	
	Scanner sc=new Scanner (System.in);
	    System.out.println("The Selling price is:");
	    double sp=sc.nextDouble();
		System.out.println("The Cost Price is:");
		double cp=sc.nextDouble();
	    
		//Declare variables
		if(sp>cp)
		{
		double profit=sp-cp;
		double profit_per=(profit/cp)*100;
		
		System.out.println("The Profit is:"+profit);
		System.out.println("The Profit Percentage:"+profit_per);
		}
	
		//Find profit and loss percentages based on cost and selling price
	   else
	   {
	
		double loss=cp-sp;
		double loss_per=(loss/cp)*100;
		
		System.out.println("The Loss is:"+loss);
		System.out.println("The Loss Percentage:"+loss_per);
	   }	
		
	}

}
