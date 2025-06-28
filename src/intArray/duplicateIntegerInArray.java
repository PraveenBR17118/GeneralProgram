package intArray;

import java.util.*;
import java.util.Map.Entry;

public class duplicateIntegerInArray 
{

	public static void main(String[] args) 
	{
		int[] ia = new int[] {1,2,3,2,4,5,6,7,8,9,1,10,12,11,13};
		
		duplicateInt(ia);
		

	}
	
	
	public static void duplicateInt(int [] a) 
	{
		HashMap <Integer,Integer> hgd = new HashMap<Integer,Integer>();
		for(int an : a) 
		{
			if(hgd.containsKey(an)) 
			{
				hgd.put(an, hgd.get(an)+1);
			}
			else 
			{
				hgd.put(an, 1);
			}
		}
		System.out.println(hgd);
		System.out.println(hgd.keySet());
		
		for(int i : hgd.keySet()) 
		{
			if(hgd.get(i) > 1) 
			{
				System.out.println(i +" repeted for "+ hgd.get(i));
			}
		}
		
		Set<Entry<Integer, Integer>> arraykeys = hgd.entrySet();
		for (Entry<Integer, Integer> entry : arraykeys) 
		{
			if (entry.getValue()>1) 
			{
				System.out.println(entry.getKey() +" Repeted for "+ entry.getValue());
			}
		}
		
	}

}
