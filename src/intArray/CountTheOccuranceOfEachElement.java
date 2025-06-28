package intArray;
import java.util.*;


public class CountTheOccuranceOfEachElement 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int[] ia = new int[] {1,2,3,6,7,3,7,4,5,11};
		occurence(ia);
		

	}
	
	public static void occurence(int [] wer) 
	{
		HashMap<Integer,Integer> dfg = new HashMap<Integer,Integer>();
		
		for(int sd : wer) 
		{
			if(dfg.containsKey(sd)) 
			{
				dfg.put(sd, dfg.get(sd)+1);
			}
			else 
			{
				dfg.put(sd, 1);
			}
			
		}
		System.out.println(dfg);
		
		/*for(Map.Entry entry : dfg.entrySet())
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
			
		}
		*/
	}

}
