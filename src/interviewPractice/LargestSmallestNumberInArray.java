package interviewPractice;

public class LargestSmallestNumberInArray
{
	
	public static void main(String[] args)
	{
		int number [ ] = {10, 15, 0, 40, 45, 99, -6};
		int largest = number[0];
		int smallest = number[0];
		
		for(int i=1;i<number.length;i++)
		{
			if(number[i]>largest)
			{
				largest=number[i];
			}
			else if(number[i]<smallest)
			{
				smallest=number[i];
			}
		}
		
		System.out.println("Largest number is: " + largest);
		System.out.println("Smallest number is: "+ smallest);
	}

}