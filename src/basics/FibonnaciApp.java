package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// Fibonacci sum of 2 prev numbers
		// fib(0) = 0
		// fib(1) = 1
		// fib(2) = fib(1) + fib(0) = 0 + 1 = 1
		// fib(3) = fib(2) + fib(1) = 1 + 1 = 2
		// fib(4) = fib(3) + fib(2) = 2 + 1 = 3
		// fib(5) = fib(4) + fib(3) = 3 + 2 = 5
		System.out.println(fib(1));
		
		// factorial
		// 1f = 1 * 1
		// 2f = 2 * 1
		// 3f = 3 * 2 * 1
		// 4f = 4 * 3 * 2 * 1
	}
	// Recurcion
	public static int fib(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		return (fib(n-1) + fib(n-2));
	}
}
