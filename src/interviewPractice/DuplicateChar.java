/*
 * Author Litton
 */
package interviewPractice;

public class DuplicateChar
{
	static int count = 0;
	public static void dupChar(String name)
	{
		char chars[] = name.toCharArray();
		
		for(int i=0; i<name.length();i++)
		{
			for(int j=i+1;j<name.length();j++)
			{
				if(chars[i]==chars[j])
				{
					System.out.println(chars[j]);
					count++;
					break;
				}
			}
		}
	}	
	
	public static void main(String[] args)
	{	
		dupChar("Litton");
	}
}