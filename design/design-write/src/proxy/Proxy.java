package proxy;

public class Proxy implements ISubject{
    private ISubject iSubject;

    public Proxy(ISubject iSubject) {
        this.iSubject = iSubject;
    }

    @Override
    public void request() {
        before();
        iSubject.request();
        after();
    }

    public void before(){
        System.out.println("called before request()");
    }

    public void after(){
        System.out.println("called after request()");
    }
}
