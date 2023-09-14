/*
Write a java program which print the next multiple of 100 for the given number.

Program is determined by the following rules:

if the given value is negative or zero, return -1

if the given value is positive, return the next multiple of the given number. Example: if x = 123, return 200.
*/
// import required classes or packages
import java.util.*;
public class NextMultipleOfHundred {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
	    System.out.print("Enetr a number:");
	    int num=sc.nextInt();
		//create scanner object and ask user to input the number
		if(num<=0)
		{
		    System.out.println("-1");
		}
		else
		{
		    int rem=num/100;
		    int round=(rem+1)*100;
		    System.out.println("The next multiple of thr given number is:"+round);
		}
		 
	}
}
