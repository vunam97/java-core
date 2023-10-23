package exercise04;

public class Exercise04 {
        public void question01(){
            Student student = new Student("long", "Hà nội");
            student.setScore(6.0);
            student.showInfo();
            student.plusScore(2.0);
            student.showInfo();
        }
}
