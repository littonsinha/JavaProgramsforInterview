package interviewPractice;

import java.util.Scanner;

public class Palindrome
{//151 454 12321
	public static void isPalindrome()
	{
		String original = "", reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string or a number");
		original = in.nextLine();
		int length = original.length();
		
		for(int i=length-1;i>=0;i--)
		{
			reverse = reverse + original.charAt(i);			
		}
		if(original.equals(reverse))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}		
	}

	public static void isPalindrome(int num)
	{
		int reverse = 0;
		int sum = 0;
		int temp;
		temp=num;		
		while(num>0)
		{
			reverse = num%10;
			sum = (sum*10)+reverse;
			num=num/10;			
		}
		if(temp==sum)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}	
	}
	public static void main(String[] args)
	{	
		isPalindrome(151);
	}
}