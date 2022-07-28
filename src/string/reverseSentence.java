package string;

public class reverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]="how are you".split(" ");
		
		for(int i=s.length-1 ;i>=0; i--) {
			System.out.print(s[i]+" ");
			
		}
	}
	
}
