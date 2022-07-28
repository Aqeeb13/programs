package string;

public class maxValueFromStrings {

	public static void main(String[] args) {
		String[] s= {"a","abc","Hello","Welcome","hi","rfgdyjg"};
		String maxlength=s[0];
		
		for (int i = 0; i < s.length; i++) {
			if(maxlength.length()<s[i].length()) {
				maxlength=s[i];
			}
		}
		//compare the lengths.................
		for(int i=0;i<s.length;i++) {
			if(maxlength.length()==s[i].length()) {
				System.out.println(s[i]);
			}
		}

	}

}
