package co.in.oops;

public class Account {
	double balance ;
	public Account(double ammount) {
		this.balance=ammount ;
		
	}
	public void deposite(double amt) {
		System.out.println("total balance :"+ balance);
		System.out.println("deposite amt"+amt);
		balance += amt ;
		System.out.println("Total balance after deposite"+balance);
		
	}
	public void withdraw(double amt) {
		System.out.println("total balance"+balance);
		System.out.println("withdrawal amt"+amt);
		balance -= amt ;
		System.out.println("total balance After withdraw:"+balance);
	}
	
	public static void main(String[]args) {
		Account a = new Account(5000.0);
		a.deposite(10000.0);
		a.withdraw(500.0);
		
	}

}
