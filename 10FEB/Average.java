import java.util.*;
public class Average {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number;");
        int a = sc.nextInt();

        System.out.println("Enter a second num:");
        int b = sc.nextInt();

        System.out.println("Enter a third num:");
        int c = sc.nextInt();

        int avg = (a+b+c)/3;
        System.out.println("Average of 3 num is:"+ avg);
        sc.close();
    }

    
}
