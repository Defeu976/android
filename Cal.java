//Enkh-Urnukh Tsolmon
//#2012260
//PDA class assignment#3
//Jan 11, 2015

public class Cal{

	String text = "HI";

	public Cal(int num1, int num2, int Oper){
		Inner in1 = new Inner();
		if (Oper == 0)
			System.out.println("You chose (-). Result is " + in1.subtract(num1,num2));
		else
			System.out.println("You chose (+). Result is " + in1.add(num1,num2));

	}

	private class Inner{
		private int add(int num1, int num2){
		return num1+num2;
		}
		private int subtract(int num1, int num2){
		return num1-num2;
		}

	}




}
