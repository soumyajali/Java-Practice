import java.util.*;
public class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int num = sc.nextInt();
        int a= 0 , b= 1;

        System.out.print("Fibonacci sequence up to " + num + " terms : ");




        for(int i = 1;i<=num;i++){
            System.out.print(a + " ");
            int c = a+b;
            a = b;
            b = c;


        }
        


    }
}
