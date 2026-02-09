import java.util.*;
public class Arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size :");

        int size = sc.nextInt();
        int[] marks = new int[size];
       /*  int [] marks = new int[3];
        marks[0]=20;
        marks[1]=30;
        marks[2]=50;

         System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);*/

        for(int i = 0;i<=2;i++){
            System.out.println(marks[i]);
        }
        sc.close();
    }
    
}
