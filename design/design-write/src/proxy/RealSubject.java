package proxy;

public class RealSubject implements ISubject{
    @Override
    public void request() {
        System.out.println("real service called");
    }
}
