
public class min {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a={1,3,100,2};

int min=Integer.MAX_VALUE;
//int max=Integer.MIN_VALUE;

for(int i=0;i<a.length;i++)
{
	if(a[i]<min)
	{
		min = a[i];
	}
	
}

System.out.println("Min value is:"+min);
/*for(int j=0;j<a.length;j++)
{
	if(a[j]>max)
	{
		max=a[j];
	}
}
System.out.println("Max value is:"+max);   */
	}

}
