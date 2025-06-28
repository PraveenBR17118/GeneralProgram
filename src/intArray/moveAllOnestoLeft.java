package intArray;

import java.lang.reflect.Array;
import java.util.*;

public class moveAllOnestoLeft 
{

	public static void main(String[] args) 
	{
		int[] ac = {2,1,3,4,5,1,6,7,11,7,4,1,1};
		System.out.println(Arrays.toString(ac));
		
		ArrayList<Integer> sc = new ArrayList<Integer>();
		for(int i = 0;i<ac.length;i++) 
		{
			if(ac[i] == 1) 
			{
				sc.addFirst(ac[i]);
			}
			else 
			{
				sc.add(ac[i]);
			}
		}
		
		System.out.println(sc);
		

	}

}
