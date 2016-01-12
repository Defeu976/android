//Enkh-Urnukh Tsolmon
//#2012260
//PDA class assignment#1
//Jan 11, 2015

import java.util.*;
class Login{

	Scanner s = new Scanner(System.in);
	

	public Login(String name, String password){
		int count=0;
		while(true){
			count++;
			if (name.equals("Superman") && password.equals("abc123")){
				System.out.println("Welcome");
				break;
			}
			else if (count == 3){
				System.out.println("You used 3 times!");
				break;
			}
			else{
			System.out.println("("+count+")"+"Enter the name: ");
			name = s.nextLine();
			System.out.println("("+count+")"+"Enter the password: ");
			password = s.nextLine());
			}
				
		}


	}
	
}
