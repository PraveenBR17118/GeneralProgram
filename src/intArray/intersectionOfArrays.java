package intArray;

import java.util.*;

public class intersectionOfArrays 
{
	static Integer[] res = new Integer[6];
	public static void main(String[] args)
	{
		Integer[] ia = {1,2,3,4,5,6};
		Integer[] ib = {2,3,4,5,8,9};
		
		
		forEachMethod(ia, ib);
		System.out.println(Arrays.toString(res));
		javaMethods(ia,ib);
	}
	
	public static void forEachMethod(Integer[] as , Integer[] ed) 
	{
		for(int i =0;i<as.length;i++) 
		{
			for(int j=0;j<ed.length;j++) 
			{
				if(as[i]==ed[j]) 
				{
					System.out.println(as[i]);
					res[i]= as[i];
				}
			}
		}
		
		
	}
	
	public static void javaMethods(Integer[] ia , Integer [] ib) 
	{
		HashSet<Integer> gfd = new HashSet<Integer>(Arrays.asList(ia));
		HashSet<Integer> gfe = new HashSet<Integer>(Arrays.asList(ib));
		gfd.retainAll(gfe);
		System.out.println(gfd);
		
	}

}
