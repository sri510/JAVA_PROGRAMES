/*
Implement a Java program that calculates the factorial of a number passed as a command-line argument.
*/
public class MyProgram
{
    public static void main(String[] args)
    {
        int num=Integer.parseInt(args[0]);
		int fact=1;
		for(int i=1;i<=num;i++) 
		{
			fact=fact*i;
		}
		System.out.println("Factorial : " + fact);
    }
}
