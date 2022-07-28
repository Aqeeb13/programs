package string;

public class findMinlengthOfStringAsIntegers {

	public static void main(String[] args) {
		String[] s= {"1","23","333","4444"};
		String minlength=s[0];
		for (int i = 0; i < s.length; i++) {
			if(minlength.length()>s[i].length()) {
				minlength=s[i];
			}
		}
for (int i = 0; i < s.length; i++) {
	if(minlength.length()==s[i].length()) {
		System.out.println(s[i]);
	}
	
}

	}

}
