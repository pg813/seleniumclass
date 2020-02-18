package oops.abstraction;

import oops.inheritance.Mobile;
import oops.inheritance.Smartphone;
import oops.inheritance.Telphone;

public class BankUser1 {

	public static void main(String[] args) {
		/*
		int a= 10;
		int b= 20;
		sum(a,b);
		RBI obj=new HDFC(); new HDFC is object here, and RBI obj is 
		callBank(obj); */
		
		callBank(new HDFC());
		callBank(new SBI());
		callBank(new HSBC());
		
		callPhone(new Telphone());
		callPhone(new Smartphone());
		callPhone(new Mobile());
		
		
	}
	
	
	public static void callBank(RBI bank)  //here rbi is reference data type and bank is variable and the value of 
	//variable is new HDFC
	{
		bank.creditCard();       
		bank.debitCard();
		bank.savingAccount();
		bank.currentAccount();
		bank.demonetization();
	
		SC.constitution();  // for static method we directly call using interface name
		
		/*or we can written above code like this also ,but problem is that 
	    RBI bank = new HDFC();
	    bank.creditCard();       
		bank.debitCard();
		bank.savingAccount();
		bank.currentAccount();
	*/
		
	}
	
	public static void callPhone(Telphone phone)   // we can use abstraction here
	{
		phone.calling();
	}
}
