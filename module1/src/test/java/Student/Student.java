package Student;

/**
 * Created by romanhrynchuk on 4/25/19.
 */
public class Student {
    private String name;
    private int rating;
    private static double avarageRating = 0.0d;
    private static int studentCount;

    public Student(){
        studentCount++;
    }

    public Student(String name) {
        this();
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
        avarageRating = (avarageRating + rating) / studentCount;
        this.rating = rating;
    }

    public static double getAvgRating() {
        return avarageRating;
    }

    public boolean betterStudent(Student student) {
        return this.rating > student.getRating();
    }

    public void changeRating(int rating) {
        avarageRating = ((avarageRating * studentCount) - this.rating + rating) / studentCount;
        this.rating = rating;
    }

    public static void removeStudent(Student student) {
        if (studentCount > 0) {
            studentCount--;
        }
    }

    @Override
    public String toString() {
        return "Rating of student " + getName() + " is " + getRating();
    }
}
