package Pattern;

public class prg12 {

    public static void main(String[] args){

        String space=" ";
        String fwd="";
        String bwd="";
        int s=0;


        for(Integer i=1;i<5;i++){

            fwd=fwd+i.toString();
            bwd=i.toString()+bwd;
            System.out.print(fwd);
            for(int j=0;j<=5-s;j++){
                System.out.print(space);

            }
            s=s+2;
            System.out.print(bwd);
            System.out.println();
        }



    }
}
