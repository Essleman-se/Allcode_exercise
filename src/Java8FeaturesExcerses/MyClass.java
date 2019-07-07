package Java8FeaturesExcerses;

public class MyClass implements Interface1, Interface2{

    public static void main(String[] args){

        MyClass myClass = new MyClass();

        myClass.log("here is the one should be log");
    }

    @Override
    public void method2() {
    }

    @Override
    public void method1(String str) {
    }

    @Override
    public void log(String str){
        System.out.println("MyClass logging::"+str);
        Interface1.printI1("Salas here for you ");
        Interface2.printI2("Salas here for you ");
    }
}
