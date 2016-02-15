
public class findIndex {
//Test one for index
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,4,4};
		int size=4; 
		float sum=0;
		int i;
		float mean;
		for(i=0;i<size;i++)
		{
			sum = sum+a[i];
		}
			
		mean = sum/size;
		
		System.out.println("Mean is"+mean);
		

	}

}
