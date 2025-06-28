package intArray;

public class ReverseNumbers 
{

	public static void main(String[] args) 
	{
		int as = 1234;
		int reminder =0 ;
		int rev=0;
		while(as>0) 
		{
			reminder= as%10;
			rev = reminder+(rev*10);
			as=as/10;
		}
		
		System.out.println(rev);

	}

}
