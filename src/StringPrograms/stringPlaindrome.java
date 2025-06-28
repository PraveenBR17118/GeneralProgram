package StringPrograms;

public class stringPlaindrome 
{

	public static void main(String[] args) 
	{
		String str= "MADAM";
		String res= "";
		
		for(int i = str.length()-1;i>=0;i--) 
		{
			res=res+ str.charAt(i);
		}
		System.out.println(res);
		if(res.equals(str)) 
		{
			System.out.println("String is plaindrome");
		}
		else 
		{
			System.out.println("String is not plaindrome");
		}
	}

}
