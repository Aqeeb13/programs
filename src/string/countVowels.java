package string;

public class countVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="India";
        // char[] s=s1.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			int count=0;
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				count++;
		System.out.println(s.charAt(i)+":"+count);
			}
			}
	}

}
