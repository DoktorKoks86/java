package newarrayproject;

public class Newapplication {

	public static void main(String[] args) {
		 
		int[][] oneArray = {{12, 49, 992}, {15, 19, 50, 60}, {23, 56, 112}};
		
		//System.out.println(oneArray[1][3]);
		//System.out.println(oneArray[2][1]);
		
		double[][] darray = new double[4][2]; // ilosæ elementów w tablicy przed i po przcinku
		
		darray[3][0] = 2.6;
		// System.out.println(darray[3][0]); // wywo³ujemy printem index element w tablicy double pocz¹wszy od 0

		for(int array=0; array<oneArray.length; array++) {
			for(int item=0; item<oneArray[array].length; item++) {
				System.out.println(oneArray[array][item]+ "\t");
			}
			
		int[] arrayA = {1, 2, 3};
		
		for(int itemN=0; itemN<arrayA.length; itemN++) {
			System.out.println(itemN); // tak tylko dla siebie :)
		}
		}
	}

}
