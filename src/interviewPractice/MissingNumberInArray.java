package interviewPractice;

public class MissingNumberInArray {

	public static void main(String[] args)
	{		
		int num[] = {1,2,3,4,5,7,8,9,10};
		int sum_a = 0;
		int sum_b = 0;
		
		for (int i=0; i<=10; i++)
		{
			sum_a = sum_a + i;
		}
		
		for(int j=0; j<num.length; j++)
		{
			sum_b = sum_b + num[j];
		}
		
		System.out.println("Missing number in the array is :: " + (sum_a-sum_b));
	}
}