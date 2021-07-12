package exercise1;

public abstract class BankAccount {
	private String owner;
	private double balance;
	
	
	
	public BankAccount() {
		this("", 0.0);
	}
	
	public BankAccount(String owner) {
		this(owner, 0.0);
	}

	public BankAccount(String owner, double balance) {
		super();
		this.owner = owner;
		this.balance = balance;
	}
	
	

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public abstract void withdrawal(double amount);
	
	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankAccount [owner=" + owner + ", balance=" + balance + "]";
	}
	
	
}
