// this uses value method char
// use return instead of statements
public class MethodsPrac5 {

	public static void main(String[] args) {
		System.out.print("The grade is " + getGrade(78.5));
	}
	public static char getGrade(double score) {
		if (score >= 90.0)
			return 'A';
		else if (score >= 80.0)
			return 'B';
		else if (score >= 70.0)
			return 'C';
		else if (score >= 60.0)
			return 'D';
		else
			return 'F';
	}

}
// franyatta