public class DiagonalSumDefferenceSol {

    public static  void main(String[] args){

        int[][] arr = {{2, 7, 10},
                       {3, 1, 9},
                       {1, 8, 11}};

        System.out.println(diagonalDifference(arr));
    }

    // Complete the diagonalDifference function below.
    public static int diagonalDifference(int[][] arr) {
        int firstDia = 0, secondDia = 0, masterIndex = 0;
        boolean foo = true;

        for(int i=0; i < arr.length; i++){
            foo = true;
            for(int j=0; j < arr.length; j++){
                if(i == j){
                    firstDia += arr[i][j];
                    //secondDia += arr[arr.length-1-i][arr.length-1-j];
                }

                if(j == arr.length-1 && foo == true){
                    masterIndex = arr.length-1;
                    foo = false;
                }
                if(foo == false)
                secondDia += arr[i][masterIndex-i];
            }
        }

        int result = Math.abs(firstDia - secondDia);

        return result;

    }
}
