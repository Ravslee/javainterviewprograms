
public class TestOne {

	static int count = 0;
	static String result = "";

	public static void main(String[] args) {

		String s = "This is Ravi Rajput";
		count = s.length();

		String out = reverse(s);
		System.out.println("" + out);

	}

	public static String reverse(String str) {

		if (count <= 0) {
			return result;
		}

		count--;
		
		result += str.charAt(count);

		return reverse(str);

	}

}
