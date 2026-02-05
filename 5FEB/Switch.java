public class Switch {
    public static void main(String[] args) {

        int n = 0; // change this value to test different days

        switch (n) {
            case 0:
                System.out.println("Mon");
                break;

            case 1:
                System.out.println("Tue");
                break;

            case 2:
                System.out.println("Wed");
                break;

            case 3:
                System.out.println("Thu");
                break;

            case 4:
                System.out.println("Fri");
                break;

            case 5:
                System.out.println("Sat");
                break;

            default:
                System.out.println("Sunday");
        }
    }
}
