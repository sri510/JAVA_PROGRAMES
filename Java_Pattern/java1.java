/*Define a method which accepts 1 numeric argument and returns a String of stars (*).

Write the method with following specifications

Name of method: createStarPattern

Arguments: 1 Integer Argument // Represents Number of Rows.

Return Type: A String value

Value must not be negative. If yes, then return -1 as string.            

Value must not be 0. If yes, then return -2 as string.               

Pattern must be created using star symbol separated by single blank space.

 Example:

Input: 4

Output:

 * * * *

 * * * *

 * * * *

 * * * *
*/
import java.util.Scanner;
class patter1{
    public static String createStarPattern(int n){
        String s = "";
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {

				s += "* ";

			}
			s += "\n";
		}
		return s;
    }
}
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
		System.out.println("Input : ");
		int s=sc.nextInt();
		String result=patter1.createStarPattern(s);
		System.out.println(result);
    }
}
