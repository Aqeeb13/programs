package string;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class reverseOrderOfOccurance {

	public static void main(String[] args) {
		String s1="Tester";
		String s=s1.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=s.length()-1;i>=0;i--) {
			set.add(s.charAt(i));
		}
		for(Character ch:set) {
			for(int i=s.length()-1;i>=0;i--) {
				if(ch==s.charAt(i)) {
					System.out.println(ch+":"+(i+1));
					break;
				}
			}
		}

	}

}
