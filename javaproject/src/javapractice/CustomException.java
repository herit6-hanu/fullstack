package javapractice;

import java.util.Scanner;

public class CustomException {
	public static void main(String[] args) throws UserDefinedException{
		Account a =new Account();
		a.enterDetails();
		a.permit();
		
		
		
	}
}


class UserDefinedException extends Exception{
	@Override
	public String getMessage() {
		return "please enter valid details";
	}
}


class Account {
	int accNum=123;
	int passKey=1434;
	
	int a;
	int p;
	
	void enterDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account number");
		a=sc.nextInt();
		System.out.println("Enter password");
		p=sc.nextInt();
	}
	
	void permit() throws UserDefinedException {
		if(accNum==a && passKey==p) {
			System.out.println("access granted");
		}else {
			UserDefinedException ude = new UserDefinedException();
			throw ude;
		}
	}
	
}
