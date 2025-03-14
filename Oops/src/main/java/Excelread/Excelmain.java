package Excelread;

public class Excelmain
{
	public static void main(String args[])
	{
		String s1=Excelread.readStringData(2,0);
		String s2=Excelread.readIntegerData(2,1);
		System.out.println(s1);
		System.out.println(s2);
	}

}
