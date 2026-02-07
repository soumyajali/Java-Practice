import java.util.*;
public class product {
    public static int CalculateProduct(int a , int b){
        int product = a * b;
        return product;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();

        int product = CalculateProduct(a, b);
        System.out.print("The product is :" + " " + product);
        sc.close();

    }
    
}
