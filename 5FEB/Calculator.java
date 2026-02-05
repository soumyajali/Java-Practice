import java.util.*;
    public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        
        System.out.println("Enter your choice :\n1.add\n2.sub\n3.mul\n4.div");
        
        int choice = sc.nextInt();

        double result;

        switch(choice){
            case 1:
                result = a + b;
                System.out.println("addition is " + result);
                break;

            case 2:
            result = a - b;
            System.out.println("subs" + result);
            break;

            case 3:
                result = a * b;
                System.out.println("mul" + result);
                break;

            case 4:
                result = a/b;
                System.out.println("division"+ result);
                break;


            default:
                System.out.println("invalid");
                sc.close();

        }

    }
}