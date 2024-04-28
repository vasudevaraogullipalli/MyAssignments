package week1.day1.assignments;

public class FindOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int range = 10;
		//int primeNumbers[] = new int[10];
		int[] oddNumbers = new int[5];
		//int[] primeNumbers = {};
		int j =0;
		for (int i = 0; i < range; i++) {

			if (i % 2 == 1) {
				oddNumbers[j] = i;
				j++;
			}

		}

		for (j = 0; j < oddNumbers.length; j++) {

			System.out.println("OddNumbers : " + oddNumbers[j]);
		}
	}

}
