package intArray;

import java.util.Arrays;

public class compareTwoArrays 
{
	static boolean status = false;

	public static void main(String[] args) 
	{
		
		int[] aa = new int[] {1,2,3,4,5,6};
		int[] bb = new int[] {1,2,3,4,5,6};
		System.out.println(compare(aa,bb));
		
		System.out.println(javaMethod(aa,bb));
		
		
		
		

	}
	
	public static boolean compare(int[] a, int[] b) 
	{
		if(a.length == b.length) 
		{
			for(int i=0;i<a.length;i++) 
			{
				if(a[i]!=b[i]) 
				{
					status = false;
					break;
				}
				else {status = true;}
			}
		}
		else {status = false;}
		
		return status;
	}
	
	public static boolean javaMethod(int[] a, int[] b) 
	{
		return Arrays.equals(a, b);
	}

}
