package string;

import java.util.HashSet;
import java.util.Scanner;

public class stringPosition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		//String s="Aqeeb";
		HashSet<Character> set=new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		for(Character it:set)//using each character........
		{
			for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==it) {
				System.out.println(it+":"+(i+1));
				break;
			}
			}
			
	}
		}
		}
