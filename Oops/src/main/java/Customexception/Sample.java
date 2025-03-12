package Customexception;

public class Sample
{
	public static void test(int age)throws LiscenceExeception
	{
		if(age<18)
		{
			throw new LiscenceExeception("exception excecuted");
		}
		else
		{
			System.out.println("eligible");
		}
		
	}
public static void main(String args[])
{
	try
	{
		Sample.test(16);
		
	}
	catch(LiscenceExeception e)
	{
		System.out.println(e);
	}
}
}
