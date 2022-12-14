package abstractfactory;

public abstract class CourseFactory {
    public void init(){
        System.out.println("初始化基础数据");
    }

    protected abstract INote crateNote();

    protected abstract IVideo createVideo();
}
