package Student;

/**
 * Created by romanhrynchuk on 4/25/19.
 */
public class Student {
    private String name;
    private int rating;

    public static double avarageRating = 0.0d;

    public Student(){}

    public Student(String name) {
        this.name = name;
    }

    public static void main(String args[]){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public static double getAvgRating() {
        return avarageRating;
    }

    //Methods
    public boolean betterStudent(Student student) {
        return this.rating > student.getRating();
    }

    public void changeRating(int rating) {
        // TODO change this student's rating and average raiting of all students
    }

    public static void removeStudent(Student student) {
        // TODO remove student
    }

    @Override
    public String toString() {
        // TODO return String with name and rating of this student
        return "";
    }
}
