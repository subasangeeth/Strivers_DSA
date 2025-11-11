package Pattern;

public class prg17 {

    public static void main(String ... args){
        char[] chars ={'A','B','C','D'};
        String space=" ";
        char[] Char = new char[]{};
        for(int i=0;i<4;i++){
            for(int j=0;j<chars.length-i;j++){
                Char[j]=chars[i];
            }

        }
    }
}
