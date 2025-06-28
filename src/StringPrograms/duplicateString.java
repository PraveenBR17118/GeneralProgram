package StringPrograms;

import java.util.*;

public class duplicateString 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String [] sta = str.split(" ");
		if(sta.length>0) 
		{
			HashMap<String,Integer> gh = new HashMap<String,Integer>();
			for(String s: sta) 
			{
				//System.out.println(s);
				if(gh.containsKey(s))
				{
					gh.put(s, gh.get(s)+1);
				}
				else 
				{
					gh.put(s, 1);
				}
			}
			//System.out.println(gh);
			Set<String> fg = gh.keySet();
			//int Count = 0;
			for(String gf:  fg) 
			{
				//Count+=1;
				if(gh.get(gf) >1) 
				{
					System.out.println(gf +" is repeated for " +gh.get(gf));
				}
				/*
				//System.out.println( gf.isEmpty());
				else if(Count == fg.size() ) 
				{
					System.out.println(Arrays.asList(sta));
				}
				//System.out.println( fg.size());
				///
				 */
				
			}
		}
		else
		{
			System.out.println(Arrays.asList(sta));
		}
		
	}

}
