package Java8FeaturesExcerses.inteface;

public interface InterfaceOne {

    void abstMethod1(int a, int b);

    default String printIname(String s){

        return s;
    }
}
