package intArray;

public class secondLargestNumberInArray 
{

	public static void main(String[] args) 
	{
		int First = Integer.MIN_VALUE;
		int Second = Integer.MIN_VALUE;
		int[] ar = {10,20,60,30,50,180};
		for(int i : ar) 
		{
			if(i>First) 
			{
				Second = First;
				First = i;
			}
			else if((i>Second) && (i!= First) ) 
			{
				Second = i;
			}	
		}
		System.out.println(Second);

	}

}
