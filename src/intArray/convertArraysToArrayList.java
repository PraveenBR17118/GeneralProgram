package intArray;

import java.util.*;


public class convertArraysToArrayList 
{

	public static void main(String[] args) 
	{
		// Method 1
		String[] ara = new String[] {"Bengaluru","Delhi","Mumbai","Chennai"};
		ArrayList<String> stra = new ArrayList<String>(Arrays.asList(ara));
		System.out.println(stra); //[Bengaluru, Delhi, Mumbai, Chennai]
		
		// Methos 2
		
		String[] arb = new String [] {"Apple","Banana","Cucumber","Delloite"};
		ArrayList<String> strb = new ArrayList<String>(arb.length);
		Collections.addAll(strb, arb);
		System.out.println(strb); //[Apple, Banana, Cucumber, Delloite]
		
		// Method 3
		
		String [] arc = new String[] {"Aeroplane","Bat","Catberry","Dodge"};
		ArrayList<String> strc = new ArrayList<String>(arc.length);
		strc.addAll(Arrays.asList(arc));
		System.out.println(strc);
		

	}

}
