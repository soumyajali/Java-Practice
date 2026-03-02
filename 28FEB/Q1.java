import java.util.*;
public class Q1
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter temprature : ");
	    float tempratureC = input.nextFloat();
	    
	    float tempF= (tempratureC*9/5) + 32;
	    System.out.println(tempF);
	    
	}
}