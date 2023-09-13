/*
Write Java Program to Convert temperature from Celsius to Fahrenheit 

Formula:

Fahrenheit=((9*Celsius)/5)+32;

Output:

Enter temperature in Celsius: 32.22

Temperature in Celsius: 89.99600000000001 °C
*/
//import required classes and/or packages
import java.util.*;
public class CelsiusToFahrenheit {
	public static void main(String args[]) {
	  Scanner sc=new Scanner(System.in);
	    System.out.print("Enter temperature in Celsius: ");
	  //create Scanner object and read temperature in celsius from the user
	  double celsius=sc.nextDouble();
      
      //Close scanner
      double fahrenheit=((9*celsius)/5)+32;
      
      // calculate Fahrenheit value
      
      System.out.println("Temperature in Celsius : "+fahrenheit+" °C");
      //display result
	}
}
