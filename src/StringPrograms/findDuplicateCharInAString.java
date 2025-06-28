package StringPrograms;

import java.util.*;

public class findDuplicateCharInAString 
{

	public static void main(String[] args) 
	{
		
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		HashMap<Character,Integer> hsc = new HashMap<Character, Integer>();
		for(char csd : ch) 
		{
			if(hsc.containsKey(csd)) 
			{
				hsc.put(csd, hsc.get(csd)+1);
			}
			else
			{
				hsc.put(csd, 1);
			}
		}
		
		Set<Character> dsc = hsc.keySet();
		for(char vc : dsc) 
		{
			if(hsc.get(vc)>1) 
			{
				System.out.println(vc +" "+hsc.get(vc));
			}
		}
	}
		

	

}
