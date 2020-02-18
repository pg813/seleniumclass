package oops.poly;

import oops.inheritance.Mobile;
import oops.inheritance.Smartphone;
import oops.inheritance.Telphone; 
//import : creting obj, ref, call static function

public class DynamnicPoly {

	public static void main(String[] args) {
		
		//Telphone phone = new Mobile();  //ref of parent and obj of child
		 

		Telphone phone;
		
		phone=new Mobile();
		phone=new Telphone();
		phone=new Smartphone();
		
		phone.calling();   //dynamic calling ,it give the result of latest override method i.e smartphone
		
		
	}

}
