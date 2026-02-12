public class SetBit{
    public static void main(String[] args){
        int n = 3;
        int pos = 1;
        int bitwise = 1 << pos;

        int Newnumber = bitwise | n;
        System.out.println(Newnumber);
    }
    
}
