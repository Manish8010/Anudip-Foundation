
public class ArrayOutOfBound {
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5};
		int i;
		try
		{
			System.out.println("Array contains");
			for(i=0;i<10;i++)
			{
				System.out.println(a[i]);
				
			}
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("The Array element index is out of Bound\n" +ae);
			
		}
		System.out.println("Exception are handled ");
	}

}
