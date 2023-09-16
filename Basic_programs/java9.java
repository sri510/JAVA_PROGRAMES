/*
Write a Java program that converts pounds to kilograms, with the weight in pounds provided as a command-line argument.

Example:- 1 pounds = 0.453592 kilograms.
*/
public class MyProgram
{
    public static void main(String[] args)
    {
        int kg=Integer.parseInt(args[0]);
		float pounds=kg*0.453592f;
		System.out.println("Pounds : " + pounds);
    }
}
