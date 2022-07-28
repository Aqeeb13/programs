package prog;

public class ascendingAndDsecending {

	public static void main(String[] args) {
		int[] a={7,11,6,24,5};
		int i=0;
		int j=0;
		//ascending........................................
        for(i=0;i<a.length;i++)
		{
		for(j=i+1;j<a.length;j++)
		{
		if(a[i]>a[j])
		{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
		}
		}
        for(i=0;i<a.length;i++)
        {
		System.out.println(a[i]+"");
        }
        System.out.println("Ascending Order..........................");
        
        //descending..............................................
        for(i=0;i<a.length;i++)
		{
		for(j=i+1;j<a.length;j++)
		{
		if(a[i]<a[j])
		{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
		}
		}
        for(i=0;i<a.length;i++)
        {
		System.out.println(a[i]+"");
        }
        System.out.println("Descending Order........................");
       
        }
	
}
