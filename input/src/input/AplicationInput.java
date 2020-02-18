package input;
import java.util.Scanner;
public class AplicationInput {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		/*System.out.println("podaj imiê: ");
		
		String text = input.nextLine();
		
		System.out.println("zajebiste imiê: " + text);*/
	
		System.out.println("insert a nr: ");
		
		double aValue = input.nextDouble();
		
		System.out.println("your nr is: " + aValue);
	}
}
