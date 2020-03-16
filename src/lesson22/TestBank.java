package lesson22;

public class TestBank {

	public TestBank() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Bank b = new Bank();
		CreditCard a1 = (CreditCard) b.openAccount("CreditCard","Tim",0);
		Account a2 = b.openAccount("Checking","Tim",1000);
		Account a3 = b.openAccount("CheckingPlus", "Tim", 1000, a1);
		a3.withdraw(10000);
		a2.deposit(777);
		b.openAccount("Yas",100000);
		b.openAccount("Tim",10000);
		a1.deposit(123);
		int z = a1.getBalance();
		System.out.println("Credit Card Balance is "+z);
		Account[] accts = b.getAccounts("Tim");
		for(Account w: accts) {
			System.out.println(w.getBalance());
		}
		
	}

}
