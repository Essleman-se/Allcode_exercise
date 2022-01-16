package designPaterExercises.singlton;

class SingltoEager {
    private static SingltoEager instance = new SingltoEager();
    private SingltoEager(){}

    public static SingltoEager getInstance(){
        return instance;
    }
}

class Singlton {
    private static Singlton instance;
    private Singlton(){}

    public static Singlton getInstance(){
        if (instance == null){
            instance = new Singlton();
        }

        return instance;
    }
}

class SynchronizedSingleton {
    private static SynchronizedSingleton instance;
    private SynchronizedSingleton(){}

    public static synchronized SynchronizedSingleton getInstance(){
        if (instance == null){
            instance = new SynchronizedSingleton();
        }

        return instance;
    }
}

class SynchronizedSingletonBlock {

    private static SynchronizedSingletonBlock instance;
    private SynchronizedSingletonBlock(){}

    public static SynchronizedSingletonBlock getInstance(){
        if (instance == null){
            synchronized (SynchronizedSingletonBlock.class) {
                if (instance == null) {
                    instance = new SynchronizedSingletonBlock();
                }
            }
        }

        return instance;
    }
}
public class SingltonExample {

    public static void main(String[] grs){
        SynchronizedSingletonBlock instance1 = SynchronizedSingletonBlock.getInstance();
        System.out.println(instance1);

        SynchronizedSingletonBlock instance2 = SynchronizedSingletonBlock.getInstance();
        System.out.println(instance2);
    }

}
