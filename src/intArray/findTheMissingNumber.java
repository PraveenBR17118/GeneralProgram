package intArray;

public class findTheMissingNumber 
{

	public static void main(String[] args) 
	{
		
		int[] iq = {1,2,3,4,6,7,8,9};
		int n = iq.length+1;
		for(int i=0;i<=n;i++) 
		{
			boolean as = false;
			
			for(int j = 0;j<n-1;j++) 
			{
				if(iq[j]==i) 
				{
					as=true;
					break;
				}
			}
			if(!as)
			{
				System.out.println(i);
			}
		}

	}

}
