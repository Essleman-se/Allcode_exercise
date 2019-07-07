package Java8FeaturesExcerses;

public interface Interface2 {

    void method2();

    default void log(String str){
        System.out.println("I2 logging::"+str);
    }

    static void printI2(String str){
        System.out.println("From I2 : " + str);
    }
}
