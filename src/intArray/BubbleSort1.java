package intArray;


import java.util.*;

public class BubbleSort1 
{
	public static void main(String[] args)
	{
		int[] arr = new int[] {1,2,10,11,8,9,3,4,5};
		int i,j,temp;
		for(i=0;i<arr.length-1;i++) 
		{
			for(j=0;j<arr.length-1;j++) 
			{
				if(arr[j]>arr[j+1]) 
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		String str = "Pune, Bengalore, Delhi, Mumbai, New York";
		String[] sta = str.split(", ");
		//ArrayList<String> stb = new ArrayList<String>(Arrays.asList(str));
		//System.out.println(stb);
		
		for(int ip = 0;ip<sta.length-1;ip++) 
		{
			for(int jp =0;jp<sta.length-1;jp++ ) 
			{
				if(sta[jp].toString().length() > sta[jp+1].toString().length()) 
				{
					String terp = sta[jp];
					sta[jp]= sta[jp+1];
					sta[jp+1] = terp;
				}
			}
		}
		System.out.println(Arrays.toString(sta));
		
		
	}

}
