public class increment{
    //postincrement

    public static void main(String[] args){
        int a = 10;
        int b = 0;
        b = a++;//postincrement
        b=++a;//preincrement
        System.out.println(a + " " + b);
    }
}