import java.util.*;
public class Factorial{
    public static void CalaculateFactorial(int n){
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact = fact * i;
        }
        System.out.println("fact" + " " + fact);
        return;
    } 

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num:"); 
        int n = sc.nextInt();
        CalaculateFactorial(n);
        sc.close();
       }
      


}