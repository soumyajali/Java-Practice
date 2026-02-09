import java.util.*;
public class NumSearchArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int num[] = new int[size];

        System.out.println("Enter the elements:");
        for(int i = 0; i<size;i++){
            num[i] = sc.nextInt();
        }

        System.out.println("Enter the number to search:");
        int x = sc.nextInt();
        for(int i = 0;i<num.length;i++){
            if(num[i]==x){
                System.out.println("FOUND at index: " + i);
            }
        }
        sc.close();
    }
    
}
