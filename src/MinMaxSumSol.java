import java.util.HashMap;
import java.util.Map;

public class MinMaxSumSol {

    public static void main(String[] args){

        int[] arr = {1, 3, 5, 7, 9};

        minMaxSum(arr);
    }

    public static void minMaxSum(int[] arr) {
     int sum = 0, maxSum = 0, minSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i < arr.length; i++){
            for(int j=0; j < arr.length; j++){
                if(i != j) sum += arr[j];
            }

            map.put(i, sum);
            sum = 0;
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){

            if(entry.getValue() > maxSum){
                maxSum = entry.getValue();
            }else
            {
                minSum = entry.getValue();
            }
        }

        System.out.print(minSum + " " + maxSum);
    }
}
