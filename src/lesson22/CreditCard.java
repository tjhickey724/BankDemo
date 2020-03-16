package lesson22;
/**
 * CreditCard maintains a negative balance
 * You are not allowed to make the balance positive
 * but you can make it zero
 * @author presenting
 *
 */
public class CreditCard extends Account{

	public CreditCard(String owner, int balance) {
		super(owner,balance);
		if (this.balance > 0) {
			throw new RuntimeException("can't open credit card with positive balance.");
		}
	}
	
	public void deposit(int amount) {
		if (this.balance+amount<=0) {
			super.deposit(amount);
		} else {
			System.out.println("Tried to overpay credit card bill");
		}
		
	}

}
