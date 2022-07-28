package string;

public class swap1stStringAndLastString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a="hello how are you".split(" ");
		String temp=a[0];
		a[0]=a[a.length-1];//push to right
		a[a.length-1]=temp;//push to left
		for(int i=0;i<a.length;i++) {
			 System.out.print(a[i]+" ");
		}
	}

}
