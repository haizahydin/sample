package Interface;

public class Child implements Sample
{
	public void details()
	{
		System.out.println(MAXVALUE);
	}
public void show()
{
	System.out.println(AGE);
}

public static void main(String args[])
{
	Sample s=new Child();
	s.details();
	s.show();
}
}
