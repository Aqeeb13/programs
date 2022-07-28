package prog;

public class sumof3MinNum {

	public static void main(String[] args) {
		int[] a= {7,18,11,12,8};
		//sorting in ascending order...............
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		}
		}
		//after sorting adding first 3 values............
		int sum=0;
		for(int i=0;i<3;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
