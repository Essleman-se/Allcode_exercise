package Java8FeaturesExcerses.codedecode.streamCodeInterviews;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8StreamCodeInterviews {

    public static void main(String[] args){
        List<Integer> ints = Arrays.asList(10, 20, 80, 12, 10, 80, 100);
        //prime number
        //ints.stream().filter(x -> x )

        ///remove duplicate
        Set<Integer> set = new HashSet<>();
        //ints.stream().filter(x-> !set.add(x)).collect(Collectors.toSet()).forEach(x->System.out.println(x));

        //limit examples
        //ints.stream().limit(4).forEach(x->System.out.println(x));

        //Skip
        //ints.stream().skip(1).forEach(x->System.out.println(x));

        //Count words in string
        String str = "Welcome to code decor and code decod welcome you";
        List<String> strs = Arrays.asList(str.split(" "));
       Map<String, Long> map = strs.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       System.out.println(map);

        /*Function<String, String> fn = Function.identity();
        System.out.println(fn.apply("salas"));*/
        //////////////////////////////////////


    }
}
