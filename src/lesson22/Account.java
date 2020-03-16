package lesson22;

public class Account {
	int balance;  // in yen
	String owner;
	
	public Account(String owner,int balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public void deposit(int d) {
		if (d<0) {
			System.out.println("can't deposit negative amount.");
			return;
		}
		this.balance+=d;
	}
	
	public void withdraw(int d) {
		System.out.println("in withdraw in regular Account");
		if (d<0) {
			System.out.println("can't withdraw negative amount.");
			return;
		}
		this.balance-=d;
	}
	
	public int getBalance() {
		return(this.balance);
	}
	
	public String getOwner() {
		return(this.owner);
	}

}
