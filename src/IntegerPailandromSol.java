import java.util.ArrayList;
import java.util.List;

public class IntegerPailandromSol {

    public static void main(String[] args){

        System.out.println(isPalindrome(12321));
    }

    public static boolean isPalindrome(int x){

//        String str = Integer.toString(x);
//        int j = str.length()-1;
//
//        for (int i=0; i < str.length(); i++){
//
//            if (str.charAt(i) != str.charAt(j))
//                return false;
//
//            j--;
//        }
//
//        if(x < 0) return false;
//
//        List<Integer> digits = new ArrayList();
//
//        while(x > 0){
//            digits.add(x%10);
//            x = x / 10;
//        }
//
//        System.out.println(digits);
//
//        int j = digits.size()-1;
//
//        for(int i=0; i < digits.size(); i++ ){
//
//            if(digits.get(i) != digits.get(j)){
//                return false;
//            }
//
//            j--;
//        }

        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }


        return x == revertedNumber || x == revertedNumber/10;


    }
}
