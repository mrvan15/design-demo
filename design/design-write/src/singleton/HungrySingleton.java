package singleton;

/***
 * 饿汉单例模式
 */
public class HungrySingleton {
    private static  final HungrySingleton singleton = new HungrySingleton();

    public HungrySingleton() {
    }

    public static  HungrySingleton getInstance(){
        return singleton;
    }
}
