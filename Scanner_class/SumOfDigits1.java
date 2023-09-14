/*
Define a method which returns the sum of digits of the given two digit number.

Write the method with the following specifications: 

Name of the BLC class:TwoDigitsSum

Name of method: getSumOfDigits()

Access Modifier : public, static

Arguments: one argument of type integer

Return type: int

This method accepts an integer value as argument and return the sum of it's digits.

Specifications: The value returned by the method getSumOfdigits() is determined by the following rules:

if the given value is in between 10 and 99, return sum of it's digits. Example: if x = 34, return 7

if the given value is negative, return -3

if the given value is greater than 99, return -2

if the given value is in between 0 and 9, return -1
*/
//import required classes and/or packages

class TwoDigitsSum{
	static int getSumOfDigits(int number) {
	    int sum=0;
		if(number>=10&&number<99)
		{
			int rem=number%10;
			number=number/10;
			int x=rem+number;
			return x;
			
		}
		else if(number<0)
		{
			return -3;
		}
		else if(number>99)
		{
			return -2;
		}
		else if(number>=0||number<=9)
		{
			return -4;
		}
		//implement the logic according to conditions provided in assignment
	
		return 0;
	}
}

public class SumOfDigits {
	public static void main(String args[]) {
	    int findSumOfDigits = TwoDigitsSum.findSumOfDigits(34);
		System.out.println(findSumOfDigits);
		
	}
}
