public class Main
{
    public static void Multiply(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        int sum = a * b;
        System.out.println(sum);
    }
	public static void main(String[] args) {
	    Multiply();
  }
}