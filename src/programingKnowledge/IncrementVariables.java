package programingKnowledge;

public class IncrementVariables 
{

	public static void main(String[] args) 
	{
		int a = 10;
		int b = a++ + ++a;
		
		System.out.println("a value is "+ a);
		System.out.println("b value is "+ b);
			/* Output
			 * a value is 12 b value is 22
			 */

	}

}
