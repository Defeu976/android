//Enkh-Urnukh Tsolmon
//#2012260
//PDA class assignment#2
//Jan 11, 2015

public class Son extends Father{
	
	public Son(int num1, int num2, int Oper){
		if (Oper == 0)
			System.out.println("You chose (-). Result is " + subtract(num1, num2));
		else
			System.out.println("You chose (+). Result is " + add(num1, num2));

	}



}
