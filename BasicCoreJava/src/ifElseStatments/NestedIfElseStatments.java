package ifElseStatments;

public class NestedIfElseStatments {

	public static void main(String[] args) {
		
		int a=10;
		int b=50;
		int c=60;
		
		if(a>b)
		{
			if(a>c) 
				System.out.println("a is greatest");
				
			else System.out.println("c is gratest");
		
		}
			else if(b>c){
				System.out.println("b is greatest");
			}
				else {
					System.out.println("c is greatest");
		
				}
		System.exit(0); 
	}


}
