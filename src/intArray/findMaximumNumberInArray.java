package intArray;

public class findMaximumNumberInArray 
{

	public static void main(String[] args) 
	{
		
		int[] ia = new int[] {10,20,30,40,190,50,60,90};
		int max = ia[0];
		int min = ia[0];
		for(int acv : ia) 
		{
			if(acv > max) 
			{
				max = acv;
			}
			if(acv <min) 
			{
				min = acv;
			}
		}
		System.out.println(max +" "+ min);

	}

}
