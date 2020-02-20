package input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AplicationInput {
	public static void main(String[] args) {

		// Scanner input = new Scanner(System.in);
		// the previous lecture
		/*
		 * System.out.println("podaj imiê: "); String text = input.nextLine();
		 * System.out.println("zajebiste imiê: " + text);
		 */

		/*
		 * System.out.println("insert a nr: "); try { double aValue =
		 * input.nextDouble();
		 * 
		 * System.out.println("your nr is: " + aValue); } catch (InputMismatchException
		 * e) { System.out.println("nie prawid³owy format danych"); }
		 */

		Scanner input = new Scanner(System.in);
		int number = 0;
		do {
			System.out.println("insert a number: ");
			number = input.nextInt();
		} while (number != 9);
		{
			System.out.println("you got 9");
		}
	}
}
