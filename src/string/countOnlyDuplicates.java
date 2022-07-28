package string;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class countOnlyDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s="hello hi hi hown are you".split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<s.length;i++) {
			set.add(s[i]);
		}
		for(String it:set) {
			int count=0;
			for (int i=0; i<s.length;i++) {
				if(it.equals(s[i])) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(it+":"+count);
			}
		}

	}

}
