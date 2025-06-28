package StringPrograms;

import java.util.*;



public class commonCharInBothString 
{
	
	public static void main(String[] args) 
	{
		String [] argb = {"flower","flew","flight"};
		Set<Character> sta = new HashSet<Character>();
		for(char ch :argb[0].toCharArray() ) 
		{
			sta.add(ch);
		}
		
		
		for(int i =1;i<argb.length;i++) 
		{
			Set<Character> stb = new HashSet<Character>();
			for(char ci :argb[i].toCharArray()) 
			{
				if(sta.contains(ci)) 
				{
					stb.add(ci);
				}
			}
			sta.retainAll(stb);
		}
		System.out.println(sta);
		
		
	}
  
	
	
	
	
	
}



/* public static void main(String[] args) 
{
    String[] strs = {"flower", "flew", "flight"};
    //String[] strd =null;
    System.out.println("Common Characters: " + findCommonCharacters(strs));
}

public static Set<Character> findCommonCharacters(String[] strs) 
{
    if (strs == null || strs.length == 0) 
    {
        return new HashSet<>();
    }

    Set<Character> commonSet = new HashSet<>();
    
    for (char c : strs[0].toCharArray()) 
    {
        commonSet.add(c);
    }

    for (int i = 1; i < strs.length; i++) 
    {
        Set<Character> currentSet = new HashSet<>();
        for (char c : strs[i].toCharArray())
        {
            if (commonSet.contains(c)) 
            {
                currentSet.add(c);
            }
        }
        commonSet.retainAll(currentSet); // Keep only common characters
    }

    return commonSet;
}
*/