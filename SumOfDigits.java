
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(sum(101));
	}

	public static int sum(int n) {
		 
		 if(n==0) {
			 return 0;
		 }else {
			 return n%10 +sum(n/10);
		 }
	 }
}
