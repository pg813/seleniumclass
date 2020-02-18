package exceptionHandling;

public class ExceptionHanddle {

	public static void main(String[] args) {
	try {
		//Exception1
				System.out.println(10/2);  //arithmatic exception(10/2)
				
				//Exception 2
				String name="pooja";
				System.out.println(name.charAt(0));
		
				//ExceptionType1.a.sum(10,20);   //non-static method we can call using method
	}catch(ArithmeticException e)
	{
		System.out.println("Recovery1");
	}catch(Exception e)
	{
		System.out.println("Recovery2");
	}finally {
		
		System.out.println("finally");
	}

	System.out.println("pooja");
	}

}
