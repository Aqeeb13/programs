package prog;

public class firstMinNum {

	public static void main(String[] args) {
		int[] a= {15,8,9,22,1};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println(min);
	}
}
