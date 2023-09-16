/*
Develop a Java program that converts kilometers to miles, with the distance in kilometers provided as a command-line argument.

Example:- 1 Kilometer=0.621371 miles.
  */
public class MyProgram
{
    public static void main(String[] args)
    {
        int km=Integer.parseInt(args[0]);
		float miles=km*0.621371f;
		System.out.println("Miles : " + miles);

    }
}
