package exercise1;

public class Test {

	public static void main(String[] args) {
		BankAccount c1 = new CheckingAccount("Jesper", 5.00, 200.00);
		BankAccount s1 = new SavingsAccount("Kaz", 100000.00, 0.2);
		
		c1.withdrawal(2.00);
		s1.withdrawal(10.00);
		
		System.out.println(c1);
		System.out.println(s1);

	}

}
