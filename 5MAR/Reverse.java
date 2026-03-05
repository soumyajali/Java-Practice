public class Reverse{
    public static void main(String args[]){
        int og = 1234;
        int rev=0;

        while(og>0){
            int rem = og % 10;
            og = og/10;

            rev = rev * 10 + rem;

        }



        System.out.println(rev);
    }
}