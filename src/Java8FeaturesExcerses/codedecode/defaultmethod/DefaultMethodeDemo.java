package Java8FeaturesExcerses.codedecode.defaultmethod;

import Java8FeaturesExcerses.Interface1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DefaultMethodeDemo {

    public static void main(String[] args){
        Interface1Impl1 f1 = new Interface1Impl1();
//        f1.method1();
//        f1.method2();
//        f1.defaultM1();
//        System.out.println(f1.defaultM3());
//        //interface1.staticM1();
//        f1.staticMethodCall();

        Predicate<String> checkLen = s -> s.length() > 5;
        //System.out.println("String length result :  " + checkLen.test("Salasd"));

        Predicate<String> evenOddLength = s -> s.length() % 2 == 0;
        //System.out.println("String length result even or odd check :  " + checkLen.test("Salasd"));

        //System.out.println("After joing with OR  : " + checkLen.or(evenOddLength).test("sasaaaa"));
        //System.out.println("After joing   with AND: " + checkLen.and(evenOddLength).test("sas"));
        //System.out.println("After joing  NAGET : " + checkLen.negate().test("sashhhh"));

        //Function interface examples
        Function<Integer, Integer> doubleIt = i -> 2*i;
        //System.out.println("Function interface Square results  : " + doubleIt.apply(2));

        Function<Integer, Integer> cubeIt = i -> i*i*i;
        //System.out.println("Function interface cube it  results  : " + cubeIt.apply(2));

        //System.out.println("Function interface Square results andThen  : " + doubleIt.andThen(cubeIt).apply(2));
        //System.out.println("Function interface Square results compose  : " + doubleIt.compose(cubeIt).apply(2));

        Consumer<Integer> squareMe = x -> System.out.println("Take one input and perform operation : " + x * x);
        squareMe.accept(5);

        Consumer<Integer> doubleMe = x -> System.out.println("Take one input and perform operation : " + x * x);
        doubleMe.accept(5);

        squareMe.andThen(doubleMe).accept(4);




    }
}
