package Interfacemulipleinheritance;

public class Child implements Interface1,Interface2
{
	public void detail()
	{
		System.out.println(AGE);
	}
public void show()
{
	System.out.println(NO);
}
public void print()
{
	System.out.println(SCORE);
}
public static void main(String args[])
{
Child c=new Child();
c.detail();
c.show();
c.print();
}
}