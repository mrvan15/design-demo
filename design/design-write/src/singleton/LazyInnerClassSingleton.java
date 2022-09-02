package singleton;

public class LazyInnerClassSingleton {
    public LazyInnerClassSingleton() {
        if (lazyHolder.lazy != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static final LazyInnerClassSingleton getInstance(){
        return lazyHolder.lazy;
    }

    public static class lazyHolder{
        private static final LazyInnerClassSingleton lazy = new LazyInnerClassSingleton();
    }
}
