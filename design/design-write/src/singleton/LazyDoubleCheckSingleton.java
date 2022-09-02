package singleton;

public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazy = null;

    public LazyDoubleCheckSingleton(){

    }

    public static LazyDoubleCheckSingleton getInstance(){
        if (lazy == null){
            synchronized (LazyDoubleCheckSingleton.class){
                lazy = new LazyDoubleCheckSingleton();
            }
        }
        return lazy;
    }
}
