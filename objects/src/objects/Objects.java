package objects;


class Methods {

	String animal;
	int value;
	int month;

	void run() {
		System.out.println("running");
		for (int i = 0; i < 4; i++) {
			System.out.println("My " + animal + " is " + value + " years old, ");
		}

	}

	int calculateMountsToBirthday() {
		int mounthLeft = 12 - month;
		return mounthLeft;

	}
	
	void talk(String text) {
		System.out.println(text);
	}
	
	void walk(int speed) {
		System.out.println("Walking "+ speed + " km per hour");
	}
	
	void timer(int minutes, double seconds) {
		System.out.println("it took " + minutes+ " minutes and "+ seconds+ " seconds to get down the hill");
	}
	
}

public class Objects {

	public static void main(String[] args) {

		Methods name = new Methods();
		name.animal = "cat";
		name.value = 9;
		name.month = 8;
		// name.run();
		int months = name.calculateMountsToBirthday();
		String dupa = "dupa";
		name.talk(dupa); // zamiast stringa w argument mozna wstawic zmienn¹, której wartoœci¹ jest string
		name.walk(10);
		name.timer(5, 2.0);
		System.out.println("months until birthday " + months);
	}

}
