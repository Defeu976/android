//Enkh-Urnukh Tsolmon
//#2012260
//PDA class assignment#1
//Jan 11, 2015

import java.util.*;
class Asn1{
	public static void main(String[] args){
		
		String name, password;
		Scanner s = new Scanner(System.in);
	
		System.out.println("Enter the name: ");
		name = s.nextLine();
		System.out.println("Enter the password: ");
		password = s.nextLine();

		Login l = new Login(name, password);		
		

	}
}
