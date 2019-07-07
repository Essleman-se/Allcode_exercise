import java.util.HashMap;
import java.util.Map;

public class BirthdayCakeCandlesSol {

    public static void main(String[] args){

        int[] arr = {3, 2, 3, 1, 3};

        System.out.println(birthdayCakeCandles(arr));
    }

    public static int birthdayCakeCandles(int[] arr){
        int maxCount = 0, maxKey = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i < arr.length; i++){

            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else
            {
                map.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getKey() > maxKey){
                maxKey = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return maxCount;
    }
}
