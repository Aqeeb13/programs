package string;

public class concat {

	public static void main(String[] args) {
		// concatenation of 2 strings
		String s1="hello";
		String s2="hi";
		System.out.println(s1.concat(s2));
		
		//contains llo
		String s3="hello";
		System.out.println(s3.contains("llo"));
		
        //equals function
		String s4="hello";
		String s41="hi";
		System.out.println(s4.equals("ello"));
		System.out.println(s4.equals(s41));
		
		//compare function
		String s5="hello";
		String s6="Hello";
		System.out.println(s5.compareToIgnoreCase(s6));//0//true
		System.out.println(s5.compareTo(s6));//32//false
		
		//empty function
		String s7=" ";
		System.out.println(s7.isEmpty());
		System.out.println(s7.isBlank());
		
	}

}
