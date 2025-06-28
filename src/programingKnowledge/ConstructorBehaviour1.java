package programingKnowledge;

public class ConstructorBehaviour1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new B();

	}

}

class A
{
	A()
	{
		System.out.println("A Constructor");
	}
}

class B
{
	B()
	{
		System.out.println("B Constructor");
	}
}
