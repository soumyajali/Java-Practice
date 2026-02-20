import java.util.*;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        char grade = sc.next().charAt(0);

        if (grade == 'A') {
            System.out.println("Excellent");
        } else if (grade == 'B') {
            System.out.println("Good");
        } else if (grade == 'C') {
            System.out.println("Okay");
        }

        else {
            System.out.println("Invalid Grade");
        }

        sc.close();
    }
}