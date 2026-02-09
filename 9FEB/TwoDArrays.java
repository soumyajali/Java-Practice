import java.util.*;
public class TwoDArrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size");
        int row = sc.nextInt();
        System.out.println("Enter the col:");
        int col = sc.nextInt();
        int arr [][] = new int[row][col];
        System.out.println("Enter the matrix:");
    //input
    for (int i = 0;i<row;i++){
        for(int j = 0 ;j<col;j++){
            arr[i][j] = sc.nextInt();
        }
    }

    //output
    System.out.println("Matrix is :");
    for(int i = 0;i<row;i++){
        for(int j = 0;j<col;j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println("Enter the element to search:");
    int x = sc.nextInt();
    for(int i = 0;i<row;i++){
        for(int j = 0;j<col;j++){
            if(arr[i][j]==x){
                System.out.println("found at "+ i + " " + j);
                break;
            }
            else{
                System.out.println("Not found");
            }
        }
    }
    sc.close();
    

    }
}
