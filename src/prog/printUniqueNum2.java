package prog;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class printUniqueNum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,3,4,2,1};
		HashSet<Integer> link=new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			//System.out.println(a[i]);
			link.add(a[i]);
			System.out.println(link);
			
		}

	}

}
