package adapter;

public class AdapterTest {
    public static void main(String[] args) {
        //类适配器
        DC5 adapter = new ACAdapter();
        adapter.outputDC5V();

        //对象适配器
        DC5 objectAdapter = new PowerAdaperObject(new AC220());


        //接口适配器
        DC interefaceAdapter = new PowerAdapterFace(new AC220());
        interefaceAdapter.output5v();
    }
}
