import java.util.*;

public class switch1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your grade: ");
		char grade = sc.next().charAt(0);

		switch (grade) {

			case 'A':
				System.out.println("Excellent");
				break;
			case 'B':
				System.out.println("Good");
				break;
			case 'C':

				System.out.println("Okay");
				break;

			default:
				System.out.println("Invalid Grade");
		}

		sc.close();
	}
}