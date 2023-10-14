// this method shows how void is used
// a call to a void method MUST be a statement
public class MethodsPrac4 {

	public static void main(String[] args) {
		System.out.print("The grade is ");
		printGrade(78.5);
	}
	public static void printGrade(double score) {
		if (score <= 0 || score >= 100) {
			System.out.print("Invalid score");
			return; // only use return in void if you want to go back to main method
		} else if (score >= 90.0) {
			System.out.print("A");
		} else if (score >= 80.0) {
			System.out.print("B");
		} else if (score >= 70.0) {
			System.out.print("C");
		} else if (score >= 60.0) {
			System.out.print("D");
		} else {
			System.out.print("F");
		}
	}
}
// franyatta
