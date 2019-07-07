import java.text.DecimalFormat;

public class PlusMinusSol {

    public  static void main(String[] agrs){
        int[] arr = {-4, 3, -9, 0, 4, 1};
        plusMinus(arr);
    }

    public static void plusMinus(int[] arr){
        int pCount =0, nCount = 0, zCount = 0;
        double pRatio = 0, nRatio = 0, zRatio = 0;

        for(int i=0; i < arr.length; i++){
          if(arr[i] > 0){
              pCount++;
            }else
                if(arr[i] < 0){
                    nCount++;
                }else
                    if (arr[i] == 0){
                        zCount++;
                    }
        }

        int n = arr.length;
        pRatio = pCount*1.0/n;
        nRatio = nCount*1.0/n;
        zRatio = zCount*1.0/n;

        DecimalFormat numberFormat = new DecimalFormat("0.000000");
        System.out.println(numberFormat.format(pRatio));
        System.out.println(numberFormat.format(nRatio));
        System.out.println(numberFormat.format(zRatio));
    }
}
