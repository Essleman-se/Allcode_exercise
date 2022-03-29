package Java8FeaturesExcerses.inteface;

public class InterfaceOneImpl implements InterfaceOne{

    @Override
    public void abstMethod1(int a, int b) {
        System.out.println("From interface one");
    }

    public static void main(String[] args){
        InterfaceOneImpl i1 = new InterfaceOneImpl();
        System.out.println(i1.printIname("Interface one"));
    }


}
