package intArray;
import java.util.*;

public class ConvertArrayListToArray 
{

	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Bengaluru");
		list.add("Delhi");
		list.add("Mumbai");
		list.add("Chennai");
		
		String [] stra = new String[list.size()];
		list.toArray(stra);
		
		System.out.println(Arrays.toString(stra));
		
		
	}

}
