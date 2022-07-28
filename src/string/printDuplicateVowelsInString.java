package string;

import java.util.LinkedHashSet;

public class printDuplicateVowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="india";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				System.out.print(s.charAt(i)+" ");
			}
			
			
		}

	}

}
