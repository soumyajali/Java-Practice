import java.util.Scanner;
public class test{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius:");
        float radius = sc.nextFloat();
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.println(("circumference of circle:" + circumference));
        System.out.print(("area of circle is:" + area));
        sc.close();

    }
}