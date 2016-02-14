
public class sumOfTwoArrays {

	/**
	 * @param args
	 */
	public void main(int[] c) {
		// TODO Auto-generated method stub
		int[] a={1,2,3};
		int[] b={5,6,7};
		
		int m,n; 
		int i=0;
		int j=0;
		int k=0;
		m=a.length;
		n=b.length;
		while(i<m && j<n)
		{
			if(a[i]<b[j])
			{
				c[k]=a[i];
				i++;
			}
			else
			{
				c[k]=b[j];
				j++;
			}
			k++;
		}
		System.out.println("C is"+c.length);
		if(i<m)
		{
			for(int p=i;p<m;p++)
			{
				c[k]=a[p];
				k++;
			}
		}
		else
		{
			for(int p=j;p<n;p++)
			{
				c[k]=b[p];
				k++;
			}
		}
	}
	

}
