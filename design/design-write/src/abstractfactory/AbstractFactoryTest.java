package abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        CourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.createVideo().play();
        javaCourseFactory.crateNote().edit();

        CourseFactory pythonCourseFactory = new PythonCourseFactory();
        pythonCourseFactory.crateNote().edit();
        pythonCourseFactory.createVideo().play();
    }
}
