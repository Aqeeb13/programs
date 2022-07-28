package prog;

public class seperateNumand0s {

	public static void main(String[] args) {
		int []a= {3,0,2,0,0,1};
		//creating a new space..........
		int []b=new int[a.length];
		int m=0;
		int n=a.length-1;
		
		for(int i=0;i<a.length;i++)
		{
			//push to right...................
			if(a[i]!=0)
			{
				b[n]=a[i];
				n--;
			}
			//push to left.........................
			else {
				b[m]=a[i];
				m++;
			}	
		}
		for(int i=0;i<b.length;i++) {
		System.out.println(b[i]);
		}


	}

}
