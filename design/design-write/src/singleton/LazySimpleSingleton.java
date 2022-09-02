package singleton;

/***
 * 懒汉式单例模式
 */
public class LazySimpleSingleton {
    public LazySimpleSingleton() {
    }

    private static LazySimpleSingleton  lazy = null;

    public static synchronized LazySimpleSingleton getInstance(){
        if (lazy == null){
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
