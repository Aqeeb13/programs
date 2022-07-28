package prog;

import java.util.LinkedHashSet;

public class howManyTimesNumIsRepeated {

	public static void main(String[] args) {
		int[] a= {2,3,4,2,1};
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
				for (Integer it : set) {
					int count=0;
					for (int i = 0; i < a.length; i++) {
						if(it==a[i]) {
							count++;
						}
					}
					if(count>0) {
						System.out.println(it+":"+count);
					}
				}

	}

}
