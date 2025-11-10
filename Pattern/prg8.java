package Pattern;

public class prg8 {
    public static void main(String[] args){

        int i,j,k,l=1,n=5;

       for(i=0;i<n;i++){
           for(j=1;j<=i;j++){
               System.out.print(" ");
           }
           for(k=1;k<=(n*2)-l;k++){
               System.out.print("*");
           }
           l=l+2;
           System.out.println();
       }



    }
}
