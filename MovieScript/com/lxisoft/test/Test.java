public class Test{


    public static void main(String[] args){

        char [] a = new char[10];

        for(int i = 0; i < a.length; i++)
        a[i] = (char) i ;


        String s = new String(a, 3, 3) ;
    }
}