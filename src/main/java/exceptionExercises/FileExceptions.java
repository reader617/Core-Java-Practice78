package exceptionExercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExceptions {

	public static void main(String[] args) {
		BufferedReader b1 = null;
		try {
			File f1 = new File("C:\\Users\\genevieve_zola\\Documents\\Practice\\CoreJava78\\Core-Java-Practice78\\FileReadingPractice1.txt");
			b1 = new BufferedReader(new FileReader(f1));
			String input = b1.readLine();
			while (input != null) {
				System.out.println(input);
				input = b1.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (b1 != null) {
				try {
					b1.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
