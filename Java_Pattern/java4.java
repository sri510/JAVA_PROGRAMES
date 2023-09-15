/*
Define a method which accepts 1 numeric argument and returns a String of numbers.

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

1 2 3 4

5 6 7 8 

9 10 11 12

13 14 15 16
*/
import java.util.Scanner;
class pattern4{
    public static String createStarPattern(int n){
        int k=0;
        String s="";
        if(n<0)
        return "-1";
        if(n==0)
        return "-2";
        if(n>0)
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
               s=s+(++k)+" ";
            }
           s=s+"\n";
        }
        
        return s;
        
    }
}
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
      System.out.print("input: ");
      int v=in.nextInt();
      String result=pattern4.createStarPattern(v);
      System.out.print(result);
    }
}
