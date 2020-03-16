package lesson22;

/**
 * Checking represents Checking Accounts
 * They are not allowed to go below zero in balance.
 * They don't pay interest.
 * @author presenting
 *
 */
public class Checking extends Account {

	public Checking(String owner,int balance) {
		super(owner,balance);	
		// TODO Auto-generated constructor stub
	}
	
	public void withdraw(int d) {
		System.out.println("in withdraw for checking");
		if (this.balance>=d) {
			super.withdraw(d);
		} else {
			System.out.println("Attempt to overdraw account!");
		}
		
	}
}
