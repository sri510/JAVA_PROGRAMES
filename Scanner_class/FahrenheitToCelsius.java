/*
Formula-

 Celsius=(Fahrenheit-32)*5/9;

Output:

Enter temperature in Fahrenheit: 90

Temperature in Celsius: 32.22222222222222 °C
*/
//import required classes and/or packages
import java.util.*;
public class FahrenheitToCelsius {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
	    System.out.print("Enter temperature in Fahrenheit:");
	    double fahrenheit=sc.nextDouble();
		//create Scanner object and temperature in Fahrenheit
        
        //Close scanner
        double celsius=(fahrenheit-32)*5/9;
        
        // calculate celsius value
        
        System.out.println("Temperature in Celsius:"+celsius+" °C");
        //display result   
	}
}
