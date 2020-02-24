import java.util.Scanner;

public class AppStatements {
public static void main(String[] arg) {
	
	Scanner input = new Scanner(System.in);
	/* variables types supported by switch statements char, byte, short, String int
	
	System.out.println("instruction: ");
	String text = input.nextLine();
	
	switch(text) {
	case "run":
		System.out.println("program is running");
		break;
	case "stop":
		System.out.println("Program stopped");
		break;
	default:
		System.out.println("Instruction not recognized");
		
	} */
	
	
	int numb = 10;
	int[] numbers = new int[5];
	 // int[] numbers = {15, 20, 25, 30, 35};
	
	numbers[0] = 15;
	numbers[1] = 20;
	numbers[2] = 25;
	numbers[3] = 30;
	numbers[4] = 35;
	
	 System.out.println(numbers[0]);
	 System.out.println(numbers[1]);
	 System.out.println(numbers[2]);
	 System.out.println(numbers[3]);
	 System.out.println(numbers[4]);
	 
	 for(int i=0; i < numbers.length; i++) {
		 System.out.println(numbers[i]);
	 }
	 
	
	
}
}
