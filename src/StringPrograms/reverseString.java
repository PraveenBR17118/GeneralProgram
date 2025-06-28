package StringPrograms;

import java.util.Arrays;

public class reverseString 
{
	public static void main(String[] args) 
	{
		String stra = "Automation";
		String res = "";
		for(int i = stra.length()-1;i>=0;i--) 
		{
			 res = res+stra.charAt(i);
		}
		System.out.println(res);
		
		System.out.println("+_+_+_+_+_+_+_+_");
		String Result = new StringBuilder(stra).reverse().toString();
		
		System.out.println(Result);
		
		String k[] ={"Praveen ","Pattanayak","Sandeep","malii"};
		System.out.println(k.length);
		for(int i =0;i<k.length;i++) 
		{
			k[i] = new StringBuilder(k[i]).reverse().toString();
		}
		System.out.println(Arrays.toString(k));
		
	}

}
