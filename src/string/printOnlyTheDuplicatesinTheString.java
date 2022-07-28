package string;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class printOnlyTheDuplicatesinTheString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		//String s="aqeeb";
		LinkedHashSet<Character> link=new LinkedHashSet<>();
for(int i=0;i<s.length();i++) {
			link.add(s.charAt(i));
			
		}	
		for(char ch:link) //fetch single character...........
		{

	int count=0;
	for(int i=0;i<s.length();i++) {
		if(ch==s.charAt(i)) {
			count++;
		}
	}
	//count character duplicates ..........
	if(count>1) {
		System.out.println(ch+" "+count);
	}

	}
	}
}
