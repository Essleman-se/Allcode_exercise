package Java8FeaturesExcerses;

public interface Interface1 {

    void method1(String str);

    default void log(String str){
        System.out.println("I1 logging::"+str);
    }

    static void printI1(String str){
        System.out.println("From I1 : " + str);
    }
}
