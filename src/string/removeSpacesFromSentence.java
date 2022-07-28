package string;

import java.util.Iterator;

public class removeSpacesFromSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s="hello how are you".split(" ");
		for (int i = 0; i < s.length; i++) {
			  char FirstCh = (char)(s[i].charAt(0)-32);
			  //String sub = s[i].substring(1);
			System.out.print(FirstCh+" ");
			
		}

	}

}
