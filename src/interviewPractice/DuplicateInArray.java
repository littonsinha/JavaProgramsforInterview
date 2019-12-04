package interviewPractice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray
{
	public static void main(String[] args)
	{
		String names [] = {"Java", "Python", "Ruby", "C", "Java", "Perl"};
		
		Set<String> store = new HashSet<String>();
		
		for(String name:names)
		{
			if(store.add(name)==false)
			{
				System.out.println("Duplicate element is: " + name);
			}
		}
	}
}