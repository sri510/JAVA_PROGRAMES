/*
Write a java program which print the given three-digit number is palindrome or not 

Program is determined by the following rules:

if the given number is an three digit number, Example: if x = 232, print 1. if x = 345, print 0

if 1 then print a message that the number is palindrome

if 0 then print a message that the number is not a palindrome

if the given number is negative or zero, print -1

if -1 then print a message that the given number is -ve kindly provide the +ve number only

if the given number is not an three digit number, print -2

if -2 then print the message that this program can check the operation for the 3 number only.
*/
// import required classes and packages
import java.util.*;
public class PalindromeTest {
	public static void main(String[] args) {
		int rev=0;
	    Scanner sc=new Scanner (System.in);
		// initialize Scanner object and read the number from user
		System.out.print("Enter a three digits number:");
		int num=sc.nextInt();
		int n=num;
		//ask user to input the number
		
    
		//write logic to find palindrome or not
		if(num<=0)
		{
		    System.out.println("-1");
		    System.out.println("the given number is -ve kindly provide the +ve number only");
		}
       else if(num<100||num>999)
       {
           System.out.println("-2");
           System.out.println("this program can check the operation for the 3 number only");


       }
      else if(num>99&&num<1000)
		{
		 while(num!=0)
		 {
		     int rem=num%10;
		     rev=rev*10+rem;
		      num=num/10;
		 }
		 
		System.out.println("Reverse is:"+rev);
		 if(n==rev)
		{ 
		    System.out.println("1");
		    System.out.println("The number is palindrome");
		    
		}
	    else if(rev!=n)
		{ 
		    System.out.println("0");
		    System.out.println("The number is not a palindrome");
		}
		}
      
	}
}
