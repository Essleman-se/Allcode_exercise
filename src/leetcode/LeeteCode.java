package leetcode;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class LeeteCode {

    public static void main(String[] args) {

        //System.out.println(longestCommonPrefix(new String[]{"flower", "flowe", "flight"}));
        failSafeIterator();
    }

    public static void failSafeIterator(){
        String[] data = {"Tomcat", "Undertow", "Koberneties", "WebSpher", "JBoss"};
        CopyOnWriteArrayList<String> dataList = new CopyOnWriteArrayList<>(data);
        Iterator<String> iterator = dataList.iterator();
        while (iterator.hasNext()){
            String server = iterator.next();
            System.out.println(server);
            if (server.equals("Tomcat")){
                dataList.add("Jetty");
            }
        }
        System.out.println(dataList);
    }

    public static String longestCommonPrefix(String[] strs){

        String prefix = strs[0];
        for (int i=1; i < strs.length; i++){
            while (strs[i].indexOf(prefix) != 0){
                System.out.println(strs[i].indexOf(prefix));
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }

        return prefix;
    }

    public static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;

        while (i < j){
            if (s.charAt(i) != s.charAt(j)){
//               if(!(isPalindrom(s, i+1, j) || isPalindrom(s, i, j-1))){
//                   return false;
//               }

                return isPalindrom(s, i+1, j) || isPalindrom(s, i, j-1);

            }

            i++;
            j--;
        }

        return true;
    }

    private static boolean isPalindrom(String s, int i, int j) {

        while (i < j){
            if (s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }

        return true;
    }

    public static int maxSubArray(int[] nums){
        int currMaxSub = nums[0];
        int maxSub = currMaxSub;

        for(int i=1; i < nums.length; i++){
            currMaxSub = Math.max(currMaxSub + nums[i], nums[i]);
            maxSub = Math.max(currMaxSub, maxSub);
        }

        return maxSub;
    }
    public static boolean isValid1(String s){
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else {
                if (stack.isEmpty()){
                    return false;
                }
                if (c == ')' && stack.peek() != '('
                        || c == '}' && stack.peek() != '{'
                        || c == ']' && stack.peek() != '['){
                    return false;
                }else{
                    stack.pop();
                }
            }

        }

        return stack.isEmpty();
    }
    public static boolean isValid(String s){
        if (s.length()%2 != 0)
            return false;

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else if (c == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else if (c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            } if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static int maxProfit(int[] prices){
        int leastPrice = Integer.MAX_VALUE;
        int profit = 0;

        for (int i=0; i < prices.length; i++){
            if (prices[i] < leastPrice){
                leastPrice = prices[i];
            }else if ((prices[i]-leastPrice) > profit){
                profit = prices[i]-leastPrice;
            }
        }

        return profit;
    }
    public static int lengthOfLongestSubstring(String s) {

        int index1 = 0;
        int index2 = 0;
        int maxlen = 0;
        Set<Character> set = new HashSet<>();

        while (index1 < s.length()){
            if (!set.contains(s.charAt(index1))){
                set.add(s.charAt(index1));
                System.out.println(set);
                index1++;
                maxlen = Math.max(set.size(), maxlen);
            }else{
                set.remove(s.charAt(index2));
                System.out.println(set);
                index2++;
            }
        }

        String str = s.substring(index2, index1);
        System.out.println("longest with no chars reptation : " +  str);

        return maxlen;
    }

    public static int[] twoSum(int[] arr, int target){

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i < arr.length; i++){
            int num = target - arr[i];

            if (map.containsKey(num)){
                return new int[] {map.get(num), i};
            }
            map.put(arr[i], i);
        }

        return null;
    }

}
