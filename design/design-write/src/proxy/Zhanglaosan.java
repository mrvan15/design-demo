package proxy;

public class Zhanglaosan implements IPerson{
    private ZhangSan zhangSan;

    public Zhanglaosan(ZhangSan zhangSan) {
        this.zhangSan = zhangSan;
    }

    @Override
    public void findLove() {
        System.out.println("帮张三物色对象");
        zhangSan.findLove();
        System.out.println("开始交往");
    }
}
