
public class Fib {

	public static void main(String a[]) {

		System.out.print(fib(10));
	}

	public static int fib(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Number must not be less than zero");
		} else if (n == 1 || n == 0) {
			return n;
		} else {
			return fib(n - 1) + fib(n - 2);
		}

	}
}
