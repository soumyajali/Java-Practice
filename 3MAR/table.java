import java.util.*;
public class table
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int num = input.nextInt();
	    for(int i=num;i<=num;i++){
	        for(int j=1;j<=10;j++){
	            System.out.println(i + "*" + j + "=" + i * j);
	        }
	        System.out.println();
	    }
	}
}
