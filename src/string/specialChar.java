package string;

public class specialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a123%b$./d";
		 StringBuffer alpha = new StringBuffer(),
			        num = new StringBuffer(), special = new StringBuffer();
		for(int i=0;i<s.length();i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				alpha.append(s.charAt(i));
			}
			else if(Character.isDigit(s.charAt(i))) {
				num.append(s.charAt(i));
			}
			else {
				special.append(s.charAt(i));
			}
		}
		System.out.print(alpha+" ");
		System.out.print(num+" ");
		System.out.print(special+" ");
	}
	}


