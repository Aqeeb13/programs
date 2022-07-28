package string;

import java.util.LinkedHashSet;

public class countString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		LinkedHashSet<Character> link=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			link.add(s.charAt(i));
			//System.out.println(s.charAt(i));
		}
		
			for(int i=0;i<link.size();i++) {
				System.out.print(i+1);
			}
		}

	}


