package Pattern;

public class prg10 {
    public static void main(String[] args ){
        up();
        down();

    }

    static void up(){
        int i,j;
        for(i=0;i<5;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void down(){
        int i,j;
        for(i=5;i>=0;i--){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
