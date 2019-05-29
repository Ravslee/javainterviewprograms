
public class PowerOfNum {
	public static void main(String a[]) {
		int p = 3;
		int n = 9;
		System.out.print(powerOfNum(10, 3));
	}

	public static int powerOfNum(int n, int p) {

		if (p <= 1) {
			return n;
		}

		return n * powerOfNum(n, p - 1);
	}
}
