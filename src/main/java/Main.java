class Main {
  public static void main(String[] args) {
    package eewew;

public class BankAccount {

	private int balance = 0;
	private int minBalance = -5000;
	private String owner = "";

	public BankAccount(int balance, int minBalance, String owner) {
/**
		* @param balance Amount of money in the account, can be negative
		* @param balance Must be >= minBalance
*/
        this.balance = balance;
        this.minBalance = minBalance;
        this.owner = owner;
    }
	
	public String toString() {
        return "balance of "+owner+":" + balance;
    }
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public boolean transfer(BankAccount target, int amount) {
	      if(withdraw(amount) == true) {
	    	  target.deposit(amount);
	      
	    	  return true;
	      } 
	    return false;
	}


	 public boolean withdraw(int amount) {
	        if (balance - amount < minBalance)
	            return false;
	        balance = balance - amount;
	        return true;
	    }
	 
	 public void deposit(int amount) {
	        balance = balance + amount;
	    }

	public int getBalance(int x) {
		if(x > minBalance) {
			balance = x;
		}
		return balance;
	}
	
	public int getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

}


  }
}
