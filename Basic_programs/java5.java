/*
MultiplyDoubleNumbers
*/
import java.util.*;

public class MultiplyDoubleNumbers {
    public static void main(String[] args) {
        
        float num1=(float) Double.parseDouble(args[0]);
		float num2=(float) Double.parseDouble(args[1]);
		int n=args.length;
		if(n==2)
		{
			float result=num1*num2;
			System.out.println("The value of num1:"+num1);
			System.out.println("The value of num2:"+num2);
		System.out.print("The multiplication of two no. is:"+result);
		}
		else 
		{
			System.out.println("Error");
		}
            
    }
}
