/*
Write a java which program the sum of digits of the given two digit number.

program determined by the following rules:

if the given value is in between 10 and 99, return sum of it's digits. 

﻿Example: if x = 34, print 7

if the given value is negative, print -3

if the given value is greater than 99, print -2

if the given value is in between 0 and 9, print -1
*/
import java.util.*;
public class SumOfDigits {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Create a Scanner object to read input from user
        System.out.print("Enter a number:");
        int num=sc.nextInt();

        // Prompt the user to enter a number
        
        if(num<0)
        {
            System.out.println("-3");
        }
        else if(num>99)
        {
            System.out.println("-2");
        }
        else if(num>=0&&num<=9)
        {
            System.out.println("-1");
        }
        else
        {
            int rem=num%10;
            num=num/10;
            int sum=rem+num;
            System.out.println("The sum of given number is:"+sum);
        }
        
    }
}
