package input;

import java.util.InputMismatchException;
import java.util.Scanner;


public class AplicationInput {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		/*
		 * System.out.println("podaj imi�: ");
		 * 
		 * String text = input.nextLine();
		 * 
		 * System.out.println("zajebiste imi�: " + text);
		 */

		System.out.println("insert a nr: ");
		try {
			double aValue = input.nextDouble();

			System.out.println("your nr is: "  + aValue);
		} catch (InputMismatchException e) {
			System.out.println("nie prawid�owy format danych");
		}
	}
}