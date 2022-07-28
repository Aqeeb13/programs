package string;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class removeDuplicate {

	public static void main(String[] args) {
		String s="Aqeeb";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			
			//System.out.println(s.charAt(i));
			set.add(s.charAt(i));
			
		}	
		for(char ch:set) {
			//System.out.println(ch);
		
		//System.out.println(set);
	//to count characters................ 
	//int count=0;
	for(int i=0;i<s.length();i++) {
		//System.out.println(s.charAt(i));
		if(ch==s.charAt(i)) {
			//count++;
		}
	}
	//System.out.println(ch+" "+count);
	System.out.print(ch);
	}

	}
}
