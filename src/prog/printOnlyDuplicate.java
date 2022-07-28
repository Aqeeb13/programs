package prog;

import java.util.HashSet;

public class printOnlyDuplicate {

	public static void main(String[] args) {
		int[] a= {1,2,5,1,3,5,8,5};
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);	
			}
		for(Integer it:set) {
			int count=0;
			for(int i=0;i<a.length;i++) {
				if(it==a[i]) {
					count++;
				}
			}
				if(count>1) {
			System.out.println(it+":"+count);
		}
		
			}
	}
	}
		
