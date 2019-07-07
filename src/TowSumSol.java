import java.util.Arrays;

public class TowSumSol {

    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(towSum(nums, target)));


    }

    public  static int[] towSum(int[] nums, int target) {
        int[] indecies = new int[10];
        int index = 0;
        boolean indexFlag ;

        for (int i = 0; i < nums.length; i++) {
            indexFlag = true;
            for (int j = i + 1; j < nums.length; j++) {
                if (indexFlag == true) {
                    if (nums[i] != nums[j] && nums[i] + nums[j] == target) {
                        indecies[index] = i;
                        indecies[index + 1] = j;
                        indexFlag = false;
                    }
                } else if (indexFlag == false) {
                    indecies[index] = j;
                }
            }
        }

        return indecies;
    }
}
