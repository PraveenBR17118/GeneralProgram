package StringPrograms;

import java.util.ArrayList;

public class GetConsicutiveCharFormArray 
{

	public static void main(String[] args) 
	{
		String[] stra = {"Apple", "Banana","Carrot","Bengaluru","Chennai","Mumbai","Skill","Skull","Send"}; 
		ArrayList<Character> acv = new ArrayList<Character>();
		
		for(String sa : stra) 
		{
			//System.out.println(sa);
			//System.out.println(sa.length());
			for(int i =0;i<sa.length()-1;i++) 
			{
				//System.out.println(sa.charAt(i));
				if(sa.charAt(i) == sa.charAt(i+1)) 
				{
					//System.out.println(sa.charAt(i));
					acv.add(sa.charAt(i));
				}
			}
			//System.out.println();
		}
		System.out.println(acv);

	}
	
	
	

}
