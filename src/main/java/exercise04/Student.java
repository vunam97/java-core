package exercise04;

public class Student {
    public int id;
    public String name;
    public String hometown;
    public double score;

    public Student(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
        this.score = 0.0;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void plusScore(double value) {
        this.score += value;
    }

    public void showInfo(){
        String rank;
        System.out.println();
        if(score < 4.0){
            rank = "Yếu";
        } else if(score < 6.0){
            rank = "Trung bình";
        } else if(score < 8.0) {
            rank = "Khá";
        } else {
            rank = "Giỏi";
        }
        System.out.println(name + ": " + rank);
    }
}
