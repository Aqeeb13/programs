package string;

import java.util.Scanner;

public class findDivrUsingStrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int i=sc.nextInt();
		if(i%3==0) {
			System.out.println("hi");
		}
		else if(i%5==0) {
			System.out.println("hello");
		}
		else if(i%3==0 && i%5==0) {
			System.out.println("hi & hello");
		}
		else
		{
			System.out.println("not present");
		}

	}

}
