package abstractfactory;

public class PythonCourseFactory extends CourseFactory{
    @Override
    protected INote crateNote() {
        init();
        return new PythonNote();
    }

    @Override
    protected IVideo createVideo() {
        return new PythonVideo();
    }
}
