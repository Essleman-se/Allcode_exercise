package Java8FeaturesExcerses.codedecode.defaultmethod;

public class Interface1Impl1 implements interface1, Interface2{

    public void staticMethodCall(){
        interface1.staticM1();
    }
    @Override
    public void method1() {
        System.out.println("Here is from interface one methode 1 ");
    }

    @Override
    public void method2() {
        System.out.println("Here is from interface one method 2 ");
    }

    @Override
    public void defaultM1() {
        Interface2.super.defaultM1();
    }

}
