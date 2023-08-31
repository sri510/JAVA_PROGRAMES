/*
Write a java program to check Leap Year.
Input:-
a=400
Output:-
leap year

Input:-
a=1002
Output:-
Not a leap year
*/
package aug30;

public class leap_year {
	public static void main(String[]args){
		int a;
		a=1002;
		if(a%4==0)
			System.out.println(a+" -Leap year");
		else
			System.out.println(a +" -Not a leap year");
}
}
