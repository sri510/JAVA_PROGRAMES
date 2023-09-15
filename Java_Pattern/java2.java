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

1 2 3 4

1 2 3 4

1 2 3 4


*/
import java.util.Scanner;
class pattern2{
    public static String createStarPattern(int n){
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
                System.out.print(s+j+"");
                
            }
            System.out.print("\n");
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
      String result=pattern2.createStarPattern(v);
      System.out.print(result);
    }
}
