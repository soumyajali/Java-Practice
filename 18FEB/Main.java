import java.util.*;
public class Main{

 public void func(){
      Scanner sc = new Scanner(System.in);
     int marks= sc.nextInt();
     if(marks>=90&&marks<=100){
         System.out.println("Grade A");
     }
     
     else if (marks>=70&&marks<=89){
         System.out.println("Grade B");
     }
     
     else if(marks>=50&&marks<=69){
         System.out.println("Grade C");
     }
     
     else if(marks>=35&&marks<=49){
         System.out.println("Grade D");
     }
     
     else{
         System.out.println("Fail");
     }
     sc.close();
 }
 
 public static void main(String[] args){
     Main obj = new Main();
     obj.func();
 }
}