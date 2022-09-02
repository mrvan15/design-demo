package abstractfactory;

public class PythonVideo implements IVideo{
    @Override
    public void play() {
        System.out.println("录制python视频");
    }
}
