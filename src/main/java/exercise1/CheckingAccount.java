package exercise1;

public class CheckingAccount extends BankAccount {
	private double insufficientFundsFee;
	
	public CheckingAccount() {
		this("", 0.0, 0.0);
	}
	
	public CheckingAccount(String owner) {
		this(owner, 0.0, 0.0);
	}
	
	public CheckingAccount(String owner, double balance, double iFF) {
		super(owner, balance);
		insufficientFundsFee = iFF;
	}

	public double getInsufficientFundsFee() {
		return insufficientFundsFee;
	}

	public void setInsufficientFundsFee(double insufficientFundsFee) {
		this.insufficientFundsFee = insufficientFundsFee;
	}
	
	@Override
	public void withdrawal(double amount) {
		double temp;
		temp = this.getBalance() - amount;
		if (temp >= 0.0) {
			this.setBalance(temp);
		}
		else {
			System.out.println("You have insufficient funds! You will be charged " + insufficientFundsFee);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(insufficientFundsFee);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CheckingAccount other = (CheckingAccount) obj;
		if (Double.doubleToLongBits(insufficientFundsFee) != Double.doubleToLongBits(other.insufficientFundsFee))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "CheckingAccount [insufficientFundsFee=" + insufficientFundsFee + "]";
	}
	
	
}
