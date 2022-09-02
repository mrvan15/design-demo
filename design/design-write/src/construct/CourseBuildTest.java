package construct;

public class CourseBuildTest {

    public static void main(String[] args) {
        CourseBuild build = new CourseBuild();
        build.addHomework("作业")
                .addName("fan")
                .addNote("笔记")
                .addVideo("视频")
                .addPPT("ppt");

        System.out.println("build.build() = " + build.build());
    }
}
