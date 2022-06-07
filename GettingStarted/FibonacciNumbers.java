import java.util.*;
public class FibonacciNumbers 
{
	public static void main(String[] args) 
	{
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int cnt=0;
		int num1=0;
		int num2=1;
		while(n>cnt)
		{
			System.out.println(num1);
			int sum=num1+num2;
			num1=num2;
			num2=sum;
			cnt++;
		}
	}

}