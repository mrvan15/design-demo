package adapter;

public class PowerAdapterFace implements DC{
    private AC220 ac220;

    public PowerAdapterFace(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int output5v() {
        int input220V = ac220.output220V();
        int output = input220V / 44;
        System.out.println("使用ADAPTOR.输入电压" + input220V + "V,转换后输出" + output + "V");
        return output;
    }

    @Override
    public int output12v() {
        return 0;
    }

    @Override
    public int output24v() {
        return 0;
    }

    @Override
    public int output36v() {
        return 0;
    }
}
