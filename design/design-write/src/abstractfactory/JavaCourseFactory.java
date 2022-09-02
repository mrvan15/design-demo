package abstractfactory;

public class JavaCourseFactory extends CourseFactory{
    @Override
    protected INote crateNote() {
        init();
        return new JavaNote();
    }

    @Override
    protected IVideo createVideo() {
        init();
        return new JavaVideo();
    }
}
