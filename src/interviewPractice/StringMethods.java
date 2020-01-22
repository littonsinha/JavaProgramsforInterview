package interviewPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class StringMethods
{
	public static void main(String [] args)
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("Sony");
		a.add("Star");
		a.add("Zee");
		a.add("Colors");
		System.out.println("--------for Each with Lambda Exp-----------");		
		a.forEach(tv ->	
		{
			System.out.println(tv);
		});
		System.out.println("--------------Iterator-----------");
		
		Iterator<String> itr = a.iterator();
		
		while (itr.hasNext())
		{
			String tv = itr.next();
			System.out.println(tv);
		
		}
		System.out.println("--------Iterator with Lambda Exp----------");
		
		itr = a.iterator();
		itr.forEachRemaining(tv ->
		{
			System.out.println(tv);
		});
		
		System.out.println("--------For each loop-Enhanced For loop---------------------");
		
		for(String tv: a)
		{
			System.out.println(tv);
		}	
		
		System.out.println("--------List Iterator---------------------");
		
		ListIterator<String> tv = a.listIterator(a.size());
		
		while(tv.hasPrevious())
		{
			String previous = tv.previous();
			System.out.println(previous);
		}	
	}	
}