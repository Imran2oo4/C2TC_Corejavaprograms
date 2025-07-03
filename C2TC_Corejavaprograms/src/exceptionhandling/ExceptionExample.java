package exceptionhandling;

public class ExceptionExample {
	public static void main(String args[])
	{
		try
		{
		    int a[] ={6,7,8,9};
		    System.out.println(a[5]);//raising exception object
		    
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.err.print("Exception occured:"+ae.getMessage());
		}
		  System.out.println("next line");
}
}