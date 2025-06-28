package StringPrograms;

import java.util.*;

public class countTheOccuranceofChar 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		
		HashMap<Character, Integer> hsd = new HashMap<Character, Integer>();
		for(char cas : ch) 
		{
			if(hsd.containsKey(cas))
			{
				hsd.put(cas, hsd.get(cas)+1);
			}
			else 
			{
				hsd.put(cas, 1);
			}
		}
		
		System.out.println(hsd);
		
		

	}

}
