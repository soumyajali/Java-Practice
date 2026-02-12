import java.util.*;
public class UpdateBit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();

        int n = 5;
        int pos = 1;
        int bitwise = 1<<pos;
        
        //clear bit
        if (oper == 0) {
            bitwise = ~bitwise;
            n = bitwise & n;
        }
        //set bit
        else if (oper == 1) {
            n = bitwise | n;
        }
        System.out.println(n);
        sc.close();
    }
    
    }
    

