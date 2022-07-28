package string;

import java.util.LinkedHashSet;

public class testerPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Tester";
		String s=s1.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			for (int i = 0; i < s.length(); i++) {
				if(ch==s.charAt(i)) {
					System.out.println(ch+":"+(i+1));
					break;
				}
			}
		}
		

	}

}
