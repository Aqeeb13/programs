package string;

public class seperateAplaNumSpUsingifesle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a1bc3$g#3";
		String alpha="";
		String num="";
		String spcl="";
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z') {
				alpha=alpha+s.charAt(i);
			}
				else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
					num=num+s.charAt(i);
				}
				else
				{
					spcl=spcl+s.charAt(i);
				}
			}
		System.out.println(alpha+" "+num+" "+spcl);
		}	

	}


