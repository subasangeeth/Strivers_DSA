package Pattern;

public class prg7 {
    public static void main(String[] arg){
       int l=1,j;
        for(int i=0;i<=5;i++){

           for(j=5;j>i;j--){
               System.out.print(" ");
           }
           for(int k=1;k<=l;k++){
               System.out.print("*");
           }
           l=l+2;


           System.out.println();
        }

    }
}
