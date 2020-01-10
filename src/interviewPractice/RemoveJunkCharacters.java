package interviewPractice;

public class RemoveJunkCharacters
{
	public static void main(String[] args)
	{
		String a = "!@#$Litton)(&((()";
		a = a.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(a);	
	}
}