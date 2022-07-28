package string;

import java.util.LinkedHashSet;

public class removeSpaces {

	public static void main(String[] args) {
		String s1=" Tester ";
		String s2=s1.toLowerCase();
		String s=s2.trim();
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		for(Character ch:set) {
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					System.out.print(ch);
					break;
				}
			}
		}

	}

}
