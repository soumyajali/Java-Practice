import java.util.*;
public class Main1{
    public void func(){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello" + " " + name);
        sc.close();

    }


    public static void main(String[] args){
        Main1 obj = new Main1();
        obj.func();
    }
}
