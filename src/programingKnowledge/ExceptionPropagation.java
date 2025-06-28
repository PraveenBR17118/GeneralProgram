package programingKnowledge;

public class ExceptionPropagation 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
			throw new NullPointerException();
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Arithmetic");
		}
		finally 
		{
			System.out.println("Finally");
			
		}
		// Finally 
		// NullPointerException

	}

}

