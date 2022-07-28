package string;

public class findMaxLengthOfStringAsIntegers {

	public static void main(String[] args) {
		String[] s= {"1","23","333","4444"};
		String maxlength=s[0];
		for (int i = 0; i < s.length; i++) {
			if(maxlength.length()<s[i].length()) {
				maxlength=s[i];
			}
		}
for (int i = 0; i < s.length; i++) {
	if(maxlength.length()==s[i].length()) {
		System.out.println(s[i]);
	}
	
}
	}

}
