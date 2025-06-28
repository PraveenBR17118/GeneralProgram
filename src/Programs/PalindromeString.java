package Programs;

public class PalindromeString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str = "MADAM";
		int len = str.length();
		String sa = "";
		for(int i = len-1 ;i>=0;i--) 
		{
			sa= sa+ str.charAt(i);
		}
		System.out.println(sa);
		System.out.println();
		System.out.println("_+_+_+_+_+_+_+__+_+_+_+__+++");
		if(sa.equals(str))
		{
			System.out.println("String is a palindrome " + str);
		}
		else
		{
			System.out.println("String is not a palindrome " + str);
		}
		
		
		String sv = new  StringBuilder(str).reverse().toString();
		System.out.println(sv);
		System.out.println();
		System.out.println("_+_+_+_+_+_+_+__+_+_+_+__+++");
		if(sv.equals(str))
		{
			System.out.println("String is a palindrome " + str);
		}
		else
		{
			System.out.println("String is not a palindrome " + str);
		}

	}

}
