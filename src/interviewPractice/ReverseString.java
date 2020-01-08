package interviewPractice;

public class ReverseString
{
	String str = "Litton";
	
	public void reverseStringUsingCharArray()
	{
		char chars[] = str.toCharArray();
		int len = chars.length;
		
		for(int i=len-1;i>=0;i--)
		{
			System.out.println(chars[i]);
		}	
	}
	
	public void reverseStringUsingStringBuilder()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb = sb.reverse();
		System.out.println(sb);
	}

	public void reverseStringUsingStringBuffer()
	{
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		sb = sb.reverse();
		System.out.println(sb);
	}
	
	public void reverseStringUsingCharAt()
	{
		String original = "Litton";
		String reverse = "";
		
		int length = original.length();
		for(int i = length-1;i>=0;i--)
		{
			reverse = reverse + original.charAt(i);	
		}
		System.out.println(reverse);
	}
	
	public static void main(String agrs[])
	{
		ReverseString sp = new ReverseString();
		//sp.reverseAStringUsingCharArray();
		//sp.reverseAStringUsingStringBuilder();
		sp.reverseStringUsingCharAt();
		//sp.reverseAStringUsingStringBuffer();
	}
}