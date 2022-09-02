package singleton;

/***
 * 饿汉式静态块单例模式
 */
public class HungryStaticSingleton {
    private static final  HungryStaticSingleton HUNGRY_STATIC_SINGLETON;

    static {
        HUNGRY_STATIC_SINGLETON = new HungryStaticSingleton();
    }

    public HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance(){
        return HUNGRY_STATIC_SINGLETON;
    }
}
