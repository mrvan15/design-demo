package proxy;

public class PersonTest {

    public static void main(String[] args) {
        IPerson person = new Zhanglaosan(new ZhangSan());
        person.findLove();
    }
}
