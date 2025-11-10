package Pattern;

public class prg15 {

    public static void main(String ... args){

        String s="ABCDE";
        String s1="";
        char[] c =s.toCharArray();

        int size = c.length;

        for(int i=0;i<size;i++) {

            for (int j = 0; j<size-i; j++) {
                s1 = s1 + c[j];
            }
            System.out.println(s1);
            s1 = "";
        }
        }

    }


