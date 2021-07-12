package exceptionExercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2;
		long res;
		try {
			System.out.println("Enter 2 values ");
			n1 = input.nextInt();
			n2 = input.nextInt();
			res = power(n1, n2);
			System.out.println(res);
		} catch (InputMismatchException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			input.close();
		}
		
	}
	
	public static long power(int a, int b) throws Exception {
		if (a == 0 && b == 0) {
			throw new Exception("n and p should not be 0");
		}
		if (a < 0 || b < 0) {
			throw new Exception("n or p should not be negative");
		}
		
		return (long) Math.pow(a, b);
	}

}
