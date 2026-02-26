 import java.util.*;
 public class Qfive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st num : ");
		int num1 = input.nextInt();
		System.out.print("Enter 2nd num : ");
		int num2 = input.nextInt();
		
		if(num1>num2){
		    System.out.println("num1 is greataer than num2");
		}
		else if(num2>num1){
		     System.out.println("num2 is greataer than num1");
		    
		}
		else{
		     System.out.println("num1 is equal to num2");
		}
		input.close();
		
}
    
}
