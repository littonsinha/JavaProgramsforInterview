package interviewPractice;

public class Fibonacci
{
	public static void printFibonacci(int num)
	{
		int first = 0;
		int second = 1;
		
		for(int i=1;i<=num;i++)
		{
			System.out.print(first + " ");
			int sum = first + second;
			first = second;
			second = sum;
		}
	}
	
	public static void main(String[] args)
	{
		printFibonacci(5);	
	}
}