package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkMeipo implements InvocationHandler {
    private IPerson person;
    
    public IPerson getInstance(IPerson person){
        this.person = person;
        Class<? extends IPerson> aClass = person.getClass();
        return (IPerson) Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), this);
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.person, args);
        after();
        return result;
    }

    private void before(){
        System.out.println("我是媒婆,已经收集到需求,开始物色");
    }

    private void after(){
        System.out.println("双方同意,开始交往");
    }
}
