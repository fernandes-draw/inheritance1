package application;

import entities.BusinessAccount;

public class Program {
	
	public static void main(String[] args) {
		BusinessAccount account = new BusinessAccount(8010, 
				"Bob Brown", 0.0, 500.00);
		
		System.out.println(account.getBalance());
	}

}
