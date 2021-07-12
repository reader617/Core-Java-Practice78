package exercise1;

public class SavingsAccount extends BankAccount{
	private double annualInterestRate;
	
	public SavingsAccount(String owner, double balance, double aIR) {
		super(owner, balance);
		annualInterestRate = aIR;
	}
	
	public SavingsAccount() {
		this("", 0.0, 0.1);
	}
	
	public SavingsAccount(String owner, double aIR) {
		this(owner, 0.0, aIR);
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public void depositMonthlyInterest() {
		this.deposit(this.getBalance() * annualInterestRate / 12);
	}
	
	public void withdrawal(double amount) {
		double temp;
		temp = this.getBalance() - amount;
		if (temp >= 0) {
			this.setBalance(temp);
		}
		else {
			System.out.println("You cannot withdraw that amount");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(annualInterestRate);
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
		SavingsAccount other = (SavingsAccount) obj;
		if (Double.doubleToLongBits(annualInterestRate) != Double.doubleToLongBits(other.annualInterestRate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "SavingsAccount [annualInterestRate=" + annualInterestRate + "]";
	}
	
	
}
