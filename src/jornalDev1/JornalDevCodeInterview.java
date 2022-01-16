package jornalDev1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class JornalDevCodeInterview {

    public static void main(String[] args) {
        //System.out.println("Here go !!");
        String str = "ffffff";

        //System.out.println(revers(str));
        //swapNumbers(10, 20);
        //System.out.println(checkVowles(str));
        //System.out.println(checkPrimeNumber(6));
        //febonchenumber(10);
//        List<Integer> ints2 = Arrays.asList(1, 3, 5, 7);
//        List<Integer> ints = new ArrayList<>();
//        ints.add(1);
//        ints.add(9);
//        ints.add(3);
//        ints.add(5);

        //checkListOnlyOddNum(ints2);

        //System.out.println(palaindromString("aaav"));
        System.out.println(removeWhiteSpace("salas seido"));
    }

    public static String removeWhiteSpace(String str){
        StringBuilder res = new StringBuilder();
        char[] chs = str.toCharArray();

//        for(int i=0; i < chs.length; i++){
//            if (chs[i] == ' '){
//                continue;
//            }
//            res.append(chs[i]);
//        }

        for (char ch : chs){
            if (!Character.isWhitespace(ch)){
                res.append(ch);
            }
        }


        return res.toString();
    }

    public static boolean palaindromString(String str) {

        char[] chrs = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int indx = 0;
        for (int i=chrs.length-1; i >= 0; i--){
            if (str.charAt(indx) != chrs[i])
                return false;
            indx++;
            sb.append(chrs[i]);
        }


        return str.equals(sb.toString());
    }

    public static boolean checkListOnlyOddNum(List<Integer> list) {
//        for (int num : intList){
//            if (num % 2 == 0)
//                return false;
//
//        }
//
//        return true;
        return list
                .parallelStream() // parallel stream for faster processing
                .anyMatch(x -> x % 2 != 0); // return as soon as any elements match the condition
    }

    public static void febonchenumber(int num) {
        int x = 0;
        int y = 1;
        int z = 1;

        for (int i = 1; i <= num; i++) {
            System.out.println(x + ",");
            x = y;
            y = z;
            z = x + y;

        }
    }

    public static boolean checkPrimeNumber(int num) {
        //int i = 2;
//        while (i <= num / 2) {
//            if (num % i == 0) {
//                return false;
//            }
//
//            i++;
//        }

        for (int i=2; i < num/2; i++){
            if (num%i == 0){
                return false;
            }
        }

        return true;
    }

    public static void swapNumbers(int x, int y) {
        System.out.println("Before swap");
        System.out.println("X : " + x + "   Y  :  " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swap");
        System.out.println("X : " + x + "   Y  :  " + y);
        System.out.printf("X is %d, Y is %d", x, y);

    }

    public static String revers(String str) {

        if (str == null)
            throw new IllegalArgumentException("Null value is not accepted");
        StringBuilder sb = new StringBuilder();

        char[] chrs = str.toCharArray();

        for (int i = chrs.length - 1; i >= 0; i--) {
            sb.append(chrs[i]);
        }

        return sb.toString();

    }

    public static boolean checkVowles(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}
