package week1.day1.assignments;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 8;

		int[] fib = new int[8];
		fib[0] = 0;
		fib[1] = 1;

		for (int i = 2; i < range; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}

		for (int i = 0; i < fib.length; i++) {
			System.out.println(fib[i]);
		}

	}

}
