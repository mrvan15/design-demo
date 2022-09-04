package adapter;

public class PowerAdaperObject implements DC5 {
    private AC220 ac220;

    public PowerAdaperObject(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.output220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用ADAPTER输入AC" + adapterInput + "V,输出DC" + adapterOutput + "V");
        return adapterOutput;
    }
}
