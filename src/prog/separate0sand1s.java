package prog;

public class separate0sand1s {

	public static void main(String[] args) {
		int []a= {1,0,0,1,0,1};
		//taking a new space............
		int []b=new int[a.length];
		int m=0;
		int n=a.length-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1)
			{
				//push to left................
				b[n]=a[i];
				n--;
			}
			else {
				//push to right.................
				b[m]=a[i];
				m++;
			}	
		}
		for(int i=0;i<b.length;i++) {
		System.out.println(b[i]);
		}
	}
	}
	


