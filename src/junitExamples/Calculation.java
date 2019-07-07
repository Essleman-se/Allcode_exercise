package junitExamples;

import java.util.StringTokenizer;

public class Calculation {

    public static int findMax(int[] intArray){
        int max = intArray[0];

        for (int i=0; i < intArray.length; i++){

            if (max < intArray[i])
                max = intArray[i];
        }

        return max;
    }

    public static int cube(int n){

        return n*n*n;
    }

    public static String reverseWord(String str){

        StringBuilder result = new StringBuilder();
        StringTokenizer tokenizer = new StringTokenizer(str, " ");

        while (tokenizer.hasMoreTokens()){
            StringBuilder sb = new StringBuilder();
            sb.append(tokenizer.nextToken());

            sb.reverse();
            result.append(sb);
            result.append(" ");
        }

        return result.toString();
    }
}
