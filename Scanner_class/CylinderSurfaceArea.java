/*
write a java program to calculate the total surface area of a 

cylinder? 

 Formula- Area = A=2πrh+2πr2 (take the π(pi) = 3.14).

 r=Radius

 h=Height

output:

Enter the radius of the cylinder: 5

Enter the height of the cylinder: 4

The total surface area of the cylinder is: 282.7433388230814
*/
//import required classes and/or packages
import java.util.*;
public class CylinderSurfaceArea {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the Cylinder:");
    	//create Scanner object and read Radius and Height from the user
    	
         double r=sc.nextDouble();
         System.out.print("Enter the height of the Cylinder:");
         double h=sc.nextDouble();
         

        // Close scanner
        double PI=3.14;
         double area=(2*PI*r*h)+(2*PI*r*r);
        //Calculate surface area of the cylinder using formula
        
        System.out.println("The total surface area of the Cylinder is:"+area);
       
    }
}
