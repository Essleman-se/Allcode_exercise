package jornalDev1;

public class JornalDevCodeInterview {

    public static void main(String[] args){
        //System.out.println("Here go !!");
        String str = null;

        //System.out.println(revers(str));
        swapNumbers(10, 20);
    }

    public static void swapNumbers(int x, int y){
        System.out.println("Before swap" );
        System.out.println("X : " + x + "   Y  :  " + y );

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swap" );
        System.out.println("X : " + x + "   Y  :  " + y );
        System.out.printf("X is %d, Y is %d", x, y);

    }
    public static String revers(String str){

        if (str == null)
            throw new IllegalArgumentException("Null value is not accepted");
        StringBuilder sb = new StringBuilder();

        char[] chrs = str.toCharArray();

        for(int i=chrs.length-1; i >= 0; i--) {
            sb.append(chrs[i]);
        }

        return sb.toString();

    }
}
