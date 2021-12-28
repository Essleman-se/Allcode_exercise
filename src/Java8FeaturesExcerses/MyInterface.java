package Java8FeaturesExcerses;

public interface MyInterface {

    /* This is a default method so we need not
     * to implement this method in the implementation
     * classes
     */
    default void newMethod(){

        System.out.println("Newly added default method");
    }

    default void newMethod2(){

        System.out.println("Newly added default method");
    }
    /* Already existing public and abstract method
     * We must need to implement this method in
     * implementation classes.
     */
    void existingMethod(String str);
}
