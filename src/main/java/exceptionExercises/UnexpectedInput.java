package exceptionExercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UnexpectedInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, answer;
		try {
			System.out.println("Enter 2 values: ");
			num1 = input.nextInt();
			num2 = input.nextInt();
			answer = num1 / num2;
			System.out.println(answer);
		} catch (InputMismatchException e){
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			input.close();
		}
		

	}

}
