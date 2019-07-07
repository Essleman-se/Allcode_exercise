public class ReversNumber {

    public static void main(String[] args){
        System.out.println(reverse(1534236469));
    }

   static int reverse(int x) {

       long rev = 0; int digit = 0;

       for (int i=0; x != 0; i++){
           digit = x % 10;
           rev = rev * 10 + digit;
           x = x / 10;
       }

       if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
           return 0;
       }

       return (int)rev;
    }

}
