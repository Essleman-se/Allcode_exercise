package designPaterExercises.singlton;

import java.io.Serializable;

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
    private SynchronizedSingletonBlock(){
        //prevent reflection
        if( instance != null ) {
            throw new InstantiationError( "Creating of this object is not allowed." );
        }
    }

    //Prevent deserilization
    protected Object readResolve() {
        return instance;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException  {
        return super.clone();
    }

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
        System.out.println("Hash code value  instance1: " + instance1.hashCode());

        SynchronizedSingletonBlock instance2 = SynchronizedSingletonBlock.getInstance();
        System.out.println("Hash code value  instance2: "  + instance2.hashCode());
    }

}
