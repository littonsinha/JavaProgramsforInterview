package interviewPractice;

import java.util.HashSet;

public class DuplicateInArray
{
	public static void main(String[] args)
	{
		String words [] = {"Java", "Python", "Ruby", "C", "Java", "Perl"};
		
		HashSet<String> store = new HashSet<String>();
		
		for(String name:words)
		{
			if(store.add(name)==false)
			{
				System.out.println("Duplicate element is: " + name);
			}
		}
	}
}