package intArray;


import java.util.*;

public class seperateZerosToEnd 
{
	public static void main(String[] args) 
	{
		int[] ia = new int[] {1,0,2,0,3,0,4,0,5,0,6};
		
		// Pointer to track the position for next non-zero element
       int count =0;
       for(int i =0;i<ia.length;i++) 
       {
    	// If the current element is non-zero
    	 if(ia[i]!= 0) 
    	 {
    		// Swap the current element with the 0 at index 'count'
    		int temp = ia[i];
    		ia[i] = ia[count];
    		ia[count] = temp;
    		
    		// Move 'count' pointer to the next position
    		count++;
    		
    	 }  
       }
       System.out.println(Arrays.toString(ia));
       
       int[] ik = {1,0,3,0,4,5,8,0,1};
       
       ArrayList<Integer > jh = new ArrayList<Integer>();
       int countq =0, ok =0;
       for(int y : ik) 
       {
    	   if(y !=0) 
    	   {
    		   jh.add(y);
    		   ok++;
    	   }
    	   
       }
       countq = ik.length-ok;
       System.out.println(countq);
       for(int h =countq;h>0;h--) 
       {
    	   jh.addLast(0);
       }
       
       System.out.println(jh);
       
		
		int[] trr = new int[] {1,0,2,3,4,0,5,6,7,0,9};
		int icount =trr.length-1;
		for(int s = trr.length-1;s>=0;s--) 
		{
			if(trr[s]!= 0) 
			{
				int tebnm =trr[s];
				trr[s] = trr[icount];
				trr[icount] = tebnm;
				icount--;
			}
		}
		System.out.println(Arrays.toString(trr));
		int[] fg = {10,0,20,0,30,0,40,0,50};
		int scount =0;
		for(int h =0;h<fg.length;h++) 
		{
			if(fg[h]!=0) 
			{
				int rtk = fg[h];
				fg[h] = fg[scount];
				fg[scount] = rtk;
				scount++;
			}
		}
		System.out.println(Arrays.toString(fg));
		
		Integer[] vb = {11,0,1,0,12,0,2,0,13,0,3,0,14,0,4};
		LinkedList<Integer> bgh = new LinkedList<Integer>();
		int pcount =0;
		for(int d =0; d<vb.length;d++) 
		{
			if(vb[d]!=0) 
			{
				bgh.add(vb[d]);
			}
			else 
			{
				pcount++;
				//pcount=pcount+1;
			}
			
		}
		for(int n =0; n<pcount;n++) 
		{
			bgh.addFirst(0);
		}
		System.out.println(bgh);
		
		
		
		
	}

}
