package programingKnowledge;

public class ConstructorChaining 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new child();

	}

}
class parent
{
	parent()
	{
		System.out.println("Parent");
	}
	
}

class child extends parent
{
	child()
	{
		super();
		System.out.println("Child");
	}
}
/*
 * output Parent Child
 */
