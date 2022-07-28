package prog;

public class firstMaxWithoutBubbleSorting {

	public static void main(String[] args) {
		int[] a= {15,8,9,22,10};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);	
	}
}
