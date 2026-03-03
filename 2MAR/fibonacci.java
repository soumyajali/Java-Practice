import java.util.*;
public class fibonacci
{
	public static void main(String[] args) { 
		int num = 5;
		int a = 0;
		int b = 1;
		
		for(int i = 0;i<num;i++){
		    System.out.println(a);
		    int fib = a + b;
		    a = b;
		    b = fib;
		    
		}
		    
	
	}
}