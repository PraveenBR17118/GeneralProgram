package programingKnowledge;

public class ObjectComparison 
{

	public static void main(String[] args)
	{
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		System.out.println(s1 == s2); // True
		System.out.println(s1 == s3); // False

		

	}

}
