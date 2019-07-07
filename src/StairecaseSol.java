public class StairecaseSol {

    public static  void main(String[] args){
        int n = 4;
        staircase(n);
    }
    public static void staircase(int n){
//        int m = n;
//        for (int i=0; i < n; i++){
//            System.out.println("");
//            m = n-1;
//
//            while (m >= 0){
//                if (i >= m) {
//                    System.out.print("#");
//                }else
//                    if(i < m){
//                        System.out.print(" ");
//                    }
//                    m--;
//            }
//
//        }
        for(int j=0;j < n;j++){

            for(int i=1;i <= n; i++){

                System.out.print(i < n-j? " ":"#");
            }

            System.out.println("");
        }
    }
}
