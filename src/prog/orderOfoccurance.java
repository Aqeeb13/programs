package prog;

import java.util.HashSet;

public class orderOfoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a= {1,2,6,4,8,9};
        HashSet<Integer> set=new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
        	set.add(a[i]);
		}
        for(Integer it:set) {
        	for(int i=0;i<a.length;i++) {
        		if(it==a[i]) {
        			System.out.println(it+":"+(i+1));
        			break;
        		}
        	}
        }
	}

}
