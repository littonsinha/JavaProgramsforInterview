package interviewPractice;

public class FactorialNumber
{
	
	public static int factorial(int num)
	{
		int fact=1;
		if(num==0||num==1)
			return 1;
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args)
	{
		System.out.println(factorial(5));
	}
}