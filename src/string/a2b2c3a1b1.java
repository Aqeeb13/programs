package string;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class a2b2c3a1b1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="aaabbcccab";
	
		//HashSet<Character> set=new HashSet<Character>();
		for(int i=0;i<a.length();i++) {
			//set.add(a.charAt(i));
			int count=1;
		for (int j = i+1; j < a.length(); j++) {
			if(a.charAt(i)==a.charAt(j)) {
			count++;
			i++;
		}
			else
			{
				break;
			}
		}
		
					System.out.print(a.charAt(i)+""+count);
				}
			}

	}


