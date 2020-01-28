package interviewPractice;

public class SecondLargestNumberInArray
{
	public static void main(String[] args)
	{
		int number[] = {11,25,99,2,3,10,15,98};
		int largest = number[0];
		int secondLargest = number[0];
		
		for(int i=0;i<number.length;i++)
		{
			if (number[i]>largest)
			{
				secondLargest = largest;
				largest = number[i];
			}
			else if (number[i]>secondLargest && number[i]!=largest)
			{
				secondLargest = number[i];
			}
		}
		System.out.println("Second largest number is:" + secondLargest);
	}
}