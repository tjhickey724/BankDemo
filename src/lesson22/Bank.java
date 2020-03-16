package lesson22;

public class Bank {
		int numAccounts = 0;
		Account[] accounts;
	
		public Bank() {
			// TODO Auto-generated constructor stub
			accounts = new Account[100];
		}
	
	  public Account openAccount(String owner, int initialBalance){
		    Account a = new Account(owner, initialBalance);
		    accounts[numAccounts] = a;
		    numAccounts++;
		    return a;
		  }
	  
	  public void transfer(Account a, Account b, int money){
		    a.withdraw(money);
		    b.deposit(money);
		}
	  
	  public Account openAccount(String acctType, String owner, int initialBalance){
		  Account a; 
		  switch(acctType) {		  
			  case "Checking": 
				  a = new Checking(owner, initialBalance);break;
			  case "CreditCard": 
				  a = new CreditCard(owner, initialBalance);break;
			  case "Savings": 
				  a = new Savings(owner, initialBalance);break;
			  case "Overdraft": // make this its own class
				  a = new CreditCard(owner, initialBalance);break;
			  default:
				  throw new RuntimeException("no such account type: "+acctType);
		  }
		    accounts[numAccounts] = a;
		    numAccounts++;
		    return a;
		  }
	  
	  public Account openAccount(String acctType, String owner, int initialBalance, CreditCard overdraft){
		  Account a=null; 
		  switch(acctType) {		  
			  case "CheckingPlus": 
				  a = new CheckingPlus(owner, initialBalance, overdraft);
				  break;
			  default:
				  throw new RuntimeException("no such account type: "+acctType);
		  }
		  return a;
	  }
	
	  public Account[] getAccounts(String owner){
	    int count = 0;
	    
	    for(int i = 0; i < numAccounts; i++){
	      if(this.accounts[i].getOwner().equals(owner)){
	        count++;
	      }
	    }
	
	    Account[] matchingAccounts = new Account[count];
	    int j=0;
	    for(int i = 0; i < numAccounts; i++){
	      if(this.accounts[i].getOwner().equals(owner)){
	        matchingAccounts[j++] = this.accounts[i];
	      }
	    }
	
	    return matchingAccounts;
	 
	  }

}
