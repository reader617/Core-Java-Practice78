package exceptionExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunRate {

	public static void main(String[] args) {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		Integer runsScored, oversFaced;
		Double runRate;
		String input;
		try {
			System.out.println("Enter the runs scored ");
			input = r.readLine();
			runsScored = Integer.parseInt(input);
			System.out.println("Enter the total overs faced ");
			input = r.readLine();
			oversFaced = Integer.parseInt(input);
			if (oversFaced == 0) {
				throw new ArithmeticException();
			}
			runRate = ((double) runsScored) / oversFaced;
			System.out.printf("Current run rate %.2f", runRate);
		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
