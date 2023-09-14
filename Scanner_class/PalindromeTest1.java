/*
Define a method which returns true if the given three digit number is palindrome otherwise return false.

Write the method with the following specifications: 

Name of method : isPalindrome()

   Modifiers : public, static

  return type : boolean

   Argument : one argument of type integer

This method accepts an integer value as argument and 

return true if the given number is palindrome, else retrun false.
*/
//import list of classes or packages
 class TestPalindrome{
	static boolean verifyPalindrome(int number) {
	    int rem,rev=0;
		int num=number;
		while(number!=0)
		{
			rem=number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		if(num==rev)
		{
		return true;
		}
			return false;
	// write a logic to find weather given number is palindrome or not
	
	return true;
	}	
}
public class PalindromeTest {
	public static void main(String[] args) {
	     boolean verifyPalindrome = TestPalindrome.verifyPalindrome(121);
	      System.out.println(verifyPalindrome);
	}
}
