//Enkh-Urnukh Tsolmon
//#2012260
//PDA class assignment#3
//Jan 11, 2015

import java.util.*;
class Asn	3{
	public static void main(String[] args){
		int num1, num2,oper;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		num1 = s.nextInt();
		System.out.println("Enter the 2nd number: ");
		num2 = s.nextInt();
		System.out.println("Enter the operation 0 for (-). 1 for (+)");
		oper = s.nextInt();

		new Cal(num1, num2, oper);
	}
}
