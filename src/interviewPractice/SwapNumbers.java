package interviewPractice;

public class SwapNumbers
{
	public void swapNumbersWithoutThirdVariable()
	{
		int x = 7;
		int y = 8;
		
		x = x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("Value of x is: "+ x);
		System.out.println("Value of y is: "+ y);
	}
	
	public void swapNumbersWithThirdVariable()
	{
		int temp;
		int x = 9;
		int y = 5;
		
		temp = x;
		x=y;
		y = temp;
		
		System.out.println("Value of x is: "+ x);
		System.out.println("Value of y is: "+ y);
		
	}

	public static void main(String agrs[])
	{
		SwapNumbers sn = new SwapNumbers();
		//sn.swapNumbersWithoutThirdVariable();
		sn.swapNumbersWithThirdVariable();
	}

}
