package StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String sta = sc.nextLine();
		
		System.out.println("Enter the String");
		String stb = sc.nextLine();
		
		char [] cha = sta.replaceAll("\\s", "").toCharArray();
		char [] chb = stb.replaceAll("\\s", "").toCharArray();
		System.out.println(cha.length);
		System.out.println(chb.length);
		
		Arrays.sort(cha);
		Arrays.sort(chb);
		System.out.println(Arrays.equals(cha, chb));
		
		
		System.out.println("Enter the String");
		String stc = sc.nextLine();
		
		System.out.println("Enter the String");
		String std = sc.nextLine();
		
		stc = stc.replaceAll("\\s", "");
		std = std.replaceAll("\\s", "");
		
		char [] db = stc.toCharArray();
		char [] sd = std.toCharArray();
		
		Arrays.sort(db);
		Arrays.sort(sd);
		
		System.out.println(Arrays.equals(db, sd));
		
		
		
	}

}
