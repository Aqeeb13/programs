package prog;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class removeDuplicates {

	public static void main(String[] args) {
		int[] a= {1,1,2,4,4,0,0,5,6};
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
			set.add(a[i]);
			System.out.println(set);	
		}
	}
}
