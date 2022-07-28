package string;

import java.util.LinkedHashSet;

public class removeDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s="hello hi hi how are you".split(" ");
		LinkedHashSet<String> link=new LinkedHashSet<String>();
		for(int i=0;i<s.length;i++)
		{
			link.add(s[i]);
		}
		
		for(String it:link) {
			int count=0;
			for(int i=0;i<s.length;i++) {
				if(it.equals(s[i])) {
					count++;
				}
			}
			System.out.println(it+":"+count);
		}

	}

}
