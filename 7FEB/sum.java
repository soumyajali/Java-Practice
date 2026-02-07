import java.util.*;
public class sum{
        public static int CalculateSum(int a,int b){
            int sum = a + b;
            return sum;
        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a : ");
            int a = sc.nextInt();
             System.out.print("Enter b : ");
            int b = sc.nextInt();

            int sum = CalculateSum(a,b);
            System.out.print("sum is : " + " "+ sum);


            sc.close();

            

        }
    }
  