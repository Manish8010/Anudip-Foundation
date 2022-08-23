
public class ExceptionTry {

	public static void main(String [] args)
	{
		int a=35;
		int b=0;
		int res=0;
		
		try
		{
			res=a/b;
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic EXception is found in this code\n" +ae);
		}
		
		System.out.println("\nthis is arithmetic program");
	
	}
	
}
