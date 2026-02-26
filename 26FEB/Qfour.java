import java.util.*;
public class Qfour{
    	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st num : ");
		int num1 = input.nextInt();
		System.out.print("Enter 2nd num : ");
		int num2 = input.nextInt();
		System.out.print("Enter operator:");
		char operator = input.next().charAt(0);
		
		
		
		if(operator=='+'){
		    System.out.println(num1+num2);
		}
		else if(operator=='-'){
		    System.out.println(num1-num2);
		}
		
		
		else if(operator=='*'){
		    System.out.println(num1*num2);
		}
		
		else if(operator=='/'){
		    System.out.println(num1/num2);
		    
		}
		else {
		    System.out.println("Invalid");
		    
		}
        input.close();
}
}


