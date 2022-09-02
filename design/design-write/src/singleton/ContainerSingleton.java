package singleton;

import java.util.concurrent.ConcurrentHashMap;

/***
 * 容器式单例模式
 */
public class ContainerSingleton {
    public ContainerSingleton() {
    }

    private static ConcurrentHashMap<String,Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className) throws Exception {
        synchronized (ioc){
        }
        if (ioc.containsKey(className)){
            return ioc.get(className);
        }
        Object obj = null;
        Class<?> aClass = Class.forName(className);
        obj = aClass.newInstance();
        ioc.put(className, obj);
        return obj;
    }
}
