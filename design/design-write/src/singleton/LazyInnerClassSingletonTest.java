package singleton;

import java.lang.reflect.Constructor;

public class LazyInnerClassSingletonTest {

    public static void main(String[] args) throws Exception {
        Class<?> clazz = LazyInnerClassSingleton.class;
        Constructor<?> constructor = clazz.getConstructor(null);

        constructor.setAccessible(true);
        Object obj1 = clazz.newInstance();
        Object obj2 = clazz.newInstance();

        System.out.println(obj1 == obj2);

    }
}
