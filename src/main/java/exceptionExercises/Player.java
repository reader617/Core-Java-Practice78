package exceptionExercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		try {
			System.out.println("Enter your name: ");
			name = input.nextLine();
			System.out.println("Enter your age: ");
			age = input.nextInt();
			if (age < 19) {
				throw new CustomException("InvalidAgeRangeExcpetion");
			}
			System.out.println("Player name: " + name);
			System.out.println("Age: " + age);
		} catch (InputMismatchException e) {
			System.out.println(e);
		} catch (CustomException ce) {
			System.out.println(ce);
		} finally {
			input.close();
		}

	}

}
