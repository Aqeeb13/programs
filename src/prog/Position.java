package prog;

import java.util.HashSet;

public class Position {

	public static void main(String[] args) {
		int[] a= {15,8,9,22,1,3,22,15};
		//Hashset does not allow duplicates.........
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		for(Integer it:set)
		{
			for(int i=0;i<a.length;i++) {
			if(a[i]==it) {
				System.out.println(it+":"+i);
				break;
			}
		}
		}
	}

	}


