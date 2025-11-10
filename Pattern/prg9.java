package Pattern;

public class prg9 {

    public static void main(String[] args){
        int n=5;
        uptodown(n);
        downtoup(n);


    }
    static void uptodown(int n){
        int i,j,k,l=1;

        for(i=0;i<n;i++){
            for(j=5;j>i;j--){
                System.out.print(" ");
            }
            for(k=0;k<l;k++){
                System.out.print("*");
            }
            l=l+2;
            System.out.println();
        }
    }
    static void downtoup(int n ){
        int i,j,k,l=1;

        for(i=0;i<=n;i++){
            for(j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(k=0;k<(n*2)-l;k++){
                System.out.print("*");
            }
            l=l+2;
            System.out.println();
        }


    }



}

