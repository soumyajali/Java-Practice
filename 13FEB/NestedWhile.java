public class NestedWhile {
    public static void main(String args[]){
       int i = 3;
       while(i<=3){
           int j =3;
           while(j<=3){
               System.out.println(i*j);
               j++;
           }
           i++;
           System.out.println();
       }
}
}
