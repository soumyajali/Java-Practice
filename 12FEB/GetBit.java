public class GetBit {
    public static void main(String[] args){
        int n = 7;
        int pos = 2;
        int bitmask = 1 << pos;

        if((n & bitmask) == 0){
            System.out.println("ZERO");

        }
        else{
            System.out.println("ONE");
        }


    }
    
    
}
