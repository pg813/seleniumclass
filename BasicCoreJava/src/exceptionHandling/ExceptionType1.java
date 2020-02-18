package exceptionHandling;

public class ExceptionType1 { //unchecked Exception or runtime
	static ExceptionType1 a; //object is not inlizae here so this is nullpoint exception.
	public static void main(String[] args) {
		
		//Exception1
		System.out.println(10/2);  //arithmatic exception(10/2)
		
		//Exception 2
		String name="pooja";
		System.out.println(name.charAt(0));  //java.lang.StringIndexOutOfBoundsException (name.charAt(10)
		
		
	
		a.sum(10,20);     //nullpointerException :when refrence have no value i.e only refrece is created and object is not intallze 
	}
		//Exception 3
		public  void sum(int a,int b)
		{
			System.out.println(a+b);
		}

	}


