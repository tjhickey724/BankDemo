/**
 * 
 */
package lesson22;

/**
 * @author presenting
 *
 */
public class CheckingPlus extends Checking {
	
	CreditCard overdraft;

	/**
	 * @param owner
	 * @param balance
	 */
	
	public CheckingPlus(String owner, int balance) {
		super(owner, balance);
		this.overdraft =null;
		throw new java.lang.RuntimeException("CheckingPlus accounts need an Overdraft Account.");
	}
	
	public CheckingPlus(String owner, int balance,CreditCard overdraft) {
		super(owner, balance);
		this.overdraft = overdraft;
	}
	
	public void withdraw(int d) {
		if (d>this.balance) {
			this.overdraft.withdraw(d - this.balance);
			this.balance = 0;
		}
	}

}
