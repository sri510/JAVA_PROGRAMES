/*
Write a Java program that computes the volume of a sphere using its radius as a command-line argument.
Formula:- v=3/4*pi*r*r*r.
*/

public class MyProgram
{
    public static void main(String[] args)
    {
      int radius=Integer.parseInt(args[0]);
		float pi=3.14f;
	float area=(radius*radius*radius*pi*3)/4;
	System.out.println("Area"+ area);  
    }
}
