public class ClearBit{
    public static void main(String[] args){
        int n = 5;
        int pos = 2;
        int bitwise = 1 << pos;
        bitwise = ~bitwise;

        int Newnumber = bitwise & n;
        System.out.println(Newnumber);
    }
    
}
