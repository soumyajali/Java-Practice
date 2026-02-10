import java.util.*;
public class Strings {

public static void main(String[] args){
    System.out.print("Enter your name : ");
    Scanner sc = new Scanner(System.in);
    String name = sc.next();//only for a single word
    //String name = sc.nextLine(); for a sentence
    System.out.println("My name is : " + name);
    sc.close();
}
}