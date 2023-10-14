// this program uses a method to give u the higher number
public class MethodsPrac2 {
	public static int max(int num1, int num2) {

		int result;

		if (num1 >= num2) {
			result = num1;
		} else {
			result = num2;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.print("The max number is: " + max(71, 13));
	}

}
// franyatta