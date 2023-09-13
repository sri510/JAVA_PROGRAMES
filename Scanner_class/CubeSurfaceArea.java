/*
Write a java program to calculate the curved surface area of a 

cube?

 Formula-6*side Square.

Output:

Enter the length of one side of the cube: 6

The surface area of the cube is: 216.0
*/
//import required classes and/or packages
import java.util.*;

public class CubeSurfaceArea {
    public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
        
        
    	//create Scanner object and read length of a cube from the user
        System.out.print("Enter the lenght of one side of the cube:");

        //Close scanner
        double side=sc.nextDouble();
        double area=6*(side*side);
        
        //calculate curved surface area of the cube
       
      System.out.println("The Surface area of the cube is:"+area);
        //display result
        
    }
    
}
