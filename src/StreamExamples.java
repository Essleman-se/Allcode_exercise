import java.util.Arrays;
import java.util.List;

public class StreamExamples {

    public static void main(String[] args){

        //List<> integers = Arrays.asList(1, 2, 8, 10, 5, 9);
        int[] ints = {1, 2, 8, 10, 5, 9};

        int sum = Arrays.stream(ints).filter(x -> x%2 == 0).sum();
        //int result = integers.stream().filter(x -> x%2 == 0)
        System.out.println(sum);
    }
}
