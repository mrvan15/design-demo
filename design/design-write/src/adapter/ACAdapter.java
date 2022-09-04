package adapter;

public class ACAdapter extends AC220 implements DC5{
    @Override
    public int outputDC5V() {
        int input220V = super.output220V();
        int output = input220V / 44;
        System.out.println("使用ADAPTOR.输入电压" + input220V + "V,转换后输出" + output + "V");
        return output;
    }
}
