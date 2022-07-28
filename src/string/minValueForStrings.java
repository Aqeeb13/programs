package string;

public class minValueForStrings {

	public static void main(String[] args) {
	
		String[] s= {"a","b","abc","Hello","Welcome","hi"};
		String minlength=s[0];
		
		for (int i = 0; i < s.length; i++) {
			//for strings we use length....
			if(minlength.length()>s[i].length()) {
				minlength=s[i];
			}
		}
		//compare the lengths.................
		for(int i=0;i<s.length;i++) {
			if(minlength.length()==s[i].length()) {
				System.out.println(s[i]);
			}
		}


	}

}
