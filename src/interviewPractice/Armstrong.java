package interviewPractice;

public class Armstrong
{
	public static void isArmstrong(int num)
	{
		int cube=0;
		int reverse;
		int temp;
		temp=num;	
		while(num>0)
		{
			reverse=num%10;
			num=num/10;
			cube=cube+(reverse*reverse*reverse);
		}	
		if(temp==cube)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}
	public static void main(String[] args)
	{
		isArmstrong(153);
	}
}