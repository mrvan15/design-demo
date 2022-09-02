package proxy;

public class JdkMeipoTest {
    public static void main(String[] args) {
        JdkMeipo meipo = new JdkMeipo();
        IPerson person = meipo.getInstance(new ZhangSan());
        person.findLove();
    }
}
