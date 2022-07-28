package string;

public class swapTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java";//4//12
		String s2="selenium";//8
		
		s1=s1+s2;//javaselenium
		s2=s1.substring(0, s1.length()-s2.length());//4
		s1=s1.substring(s2.length());//from 4th index to last
		
		System.out.println(s1+" "+s2);
				

	}

}
