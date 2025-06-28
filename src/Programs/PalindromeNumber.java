package Programs;

public class PalindromeNumber 
{
	public static void main(String args[])
	{
		int ia = 12321;
		int orig = ia;
		int res = 0;
		while(ia!=0)
		{
			res = res*10 + ia%10;
			ia = ia/10;
			
		}
		System.out.println(res);
		if(res == orig) 
		{
			System.out.println("Number is a Plaindrome");
		}
		
	}

}
