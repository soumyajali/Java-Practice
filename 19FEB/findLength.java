import java.util.*;

public class findLength {

    public void stringLength() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String here: ");
        String string = sc.next();
        System.out.println("String length is : " + string.length());
        sc.close();
    }

    public static void main(String[] args) {
        findLength obj = new findLength();
        obj.stringLength();
    }

}
