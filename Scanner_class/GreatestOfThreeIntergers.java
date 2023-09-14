/*
Define a method which returns the greatest number among three numbers.

Write the method with the following specifications: 

Name of method : getGretest()

   Modifiers : public, static

  return type : int

   Argument : three arguments of type integer  

This accepts Three integer values as argument and return the greatest value.
  
Arguments: three arguments of type integer

Return Type: an integer value 

Specifications: The value returned by the method getGreatest() is determined by the following rules:

if any of the given numbers are negative, return -1.

if any of the given numbers are zero, return -2.

if the given numbers are positive, return the greatest.
*/
//import required classes or packages

class FindGreatestValue{
	
	static int getGretest(int number1, int number2, int number3) {
	    if(number1>number2&&number1>number3)
		{
			return number1;
		}
		else if(number2>number1&&number2>number3)
		{
			return number2;
		}
		else if(number3>number1&&number3>number2)
		{
			return number3;
		}
		else if(number1<0||number2<0||number3<0)
		{
			return -1;
		}
		else if(number1==0||number2==0||number3==0)
		{
			return -2;
		}
	//implement the logic according to conditions provided in problem
		return 0;
	}
}
public class GreatestOfThreeIntergers {
	public static void main(String args[]) {
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number:");
		int number1=sc.nextInt();
		System.out.print("Enter second number:");
		int number2=sc.nextInt();
		System.out.print("Enter third number:");
		int number3=sc.nextInt();
		int greatest = FindGreatestValue.getGreatest(number1,number2,number3);
		System.out.println(greatest);
	}
}
