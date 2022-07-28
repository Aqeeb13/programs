package string;

import java.util.HashSet;
import java.util.Set;

public class reverseStringInSentence {

	public static void main(String[] args) {
		String[] s="hello how are you".split(" ");
		
		for(int i=0;i<s.length;i++) {
			String st=s[i];	
			
		//here we have to reverse a single string
		for(int j=st.length()-1;j>=0;j--) {
			System.out.print(st.charAt(j));
		}
			System.out.print(" ");
		}
			
		

	}

}
