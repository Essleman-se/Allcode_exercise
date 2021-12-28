package Java8FeaturesExcerses;

public class Example implements MyInterface {

    // implementing abstract method
    public void existingMethod(String str){

        System.out.println("String is: "+str);
    }

    public static void main(String[] args) {
        //Example obj = new Example();
        MyInterface obj = new Example();
        //calling the default method of interface
        obj.newMethod();
        //obj.newMethod2();
        //calling the abstract method of interface
        obj.existingMethod("Java 8 is easy to learn");

    }
}
