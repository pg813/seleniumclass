package stringClass;

public class Stringfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "Your Account Number is 1234";
		String str2= "your Account number is 1234";
		
		//Function : need to used in automation:  In string index space is also calculate.
		System.out.println(str.charAt(8));
		
		System.out.println(str.length());
		System.out.println(str.toUpperCase());  //to covert cap
		System.out.println(str.toLowerCase());  //to covert small
		System.out.println(str.equals(str2));  //compare
		System.out.println(str.equalsIgnoreCase(str2)); //ignore small and cap latter
		System.out.println(str.replace("1234","5678")); //replace the char
		System.out.println(str.substring(23));    //
		System.out.println(str.substring(23, 27)); //for extact string 
		System.out.println(str.trim());  //remove extra space of staring and ending of string
	
		System.out.println(str);
		
		System.out.println();
		
		String[] arr=str.split(" ");
		for(String s:arr)    //or for (int i= 0;i<arr.length; i++)
		{
			System.out.println(s);

	   }
		
		
		System.out.println(str.contains("1234"));
		
	}

}
