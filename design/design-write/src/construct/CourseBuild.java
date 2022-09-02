package construct;

public class CourseBuild {
    public class Course{
        private String name;
        private String ppt;
        private String video;
        private String note;
        private String homework;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPpt() {
            return ppt;
        }

        public void setPpt(String ppt) {
            this.ppt = ppt;
        }

        public String getVideo() {
            return video;
        }

        public void setVideo(String video) {
            this.video = video;
        }

        public String getNote() {
            return note;
        }

        public void setNote(String note) {
            this.note = note;
        }

        public String getHomework() {
            return homework;
        }

        public void setHomework(String homework) {
            this.homework = homework;
        }

        @Override
        public String toString() {
            return "course{" +
                    "name='" + name + '\'' +
                    ", ppt='" + ppt + '\'' +
                    ", video='" + video + '\'' +
                    ", note='" + note + '\'' +
                    ", homework='" + homework + '\'' +
                    '}';
        }
    }

    private Course course = new Course();

    public CourseBuild addName(String name){
        course.setName(name);
        return this;
    }

    public CourseBuild addPPT(String ppt){
        course.setPpt(ppt);
        return  this;
    }

    public CourseBuild addVideo(String video){
        course.setVideo(video);
        return this;
    }

    public CourseBuild addNote(String note){
        course.setNote(note);
        return this;
    }

    public CourseBuild addHomework(String homework){
        course.setHomework(homework);
        return this;
    }

    public Course build(){
        return this.course;
    }
}
