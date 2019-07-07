import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static java.lang.System.out;

public class StreamExercise {

    public static void main(String[] args){

        streamExample_collect();

    }

    public static void streamExample_collect(){
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 9, 10, 11);

         List<Integer> oddNumbers = numbers.stream().filter(num -> num % 2 != 0)
                                   .collect(Collectors.toList());

         System.out.println(oddNumbers);
    }
}
