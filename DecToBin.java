
public class DecToBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		decToBin(20);
	}

	public static void decToBin(int n) {
		if (n > 0) {
			decToBin(n / 2);
			System.out.printf("%d", n % 2);
		}
	}
}
