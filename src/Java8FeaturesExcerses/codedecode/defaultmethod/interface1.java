package Java8FeaturesExcerses.codedecode.defaultmethod;

public interface interface1 {
    public void method1();
    void method2();

     public default void defaultM1(){
         System.out.println("Here is from interface one  defualt method");
     }
     default String defaultM3(){

         return "Hello default method 3";
     }

     static void staticM1(){
         System.out.println("Here go static method here");
     }

//     default int hashCode(){
//        System.out.println("Here is from interface one  defualt method");
//    }
}
