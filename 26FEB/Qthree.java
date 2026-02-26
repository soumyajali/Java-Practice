import java.util.*;
public class Qthree {
    	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Principal : ");
		int Principal = input.nextInt();
		System.out.print("Enter Time : ");
		float Time = input.nextFloat();
		System.out.print("Enter Rate : ");
		float Rate = input.nextFloat();
		
		double SI = (Principal*Time*Rate)/100;
		
		
		System.out.println(SI);
		

		input.close();
	}
    
    
}
