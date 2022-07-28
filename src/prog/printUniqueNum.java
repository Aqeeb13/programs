package prog;

import java.util.HashSet;

public class printUniqueNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,2,3,4,4,5};
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
			System.out.println(set);
		}
			

	}

}
