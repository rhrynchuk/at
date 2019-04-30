package Student;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;
import static org.testng.AssertJUnit.assertEquals;

public class StudentTest {
    List<Student> students = new ArrayList<>();

    @Test
    public void testGetAvgRating() {
        assertEquals("Average rating is wrong", Student.getAvgRating(), 0.0d);

        Student student1 = new Student("Petro");
        student1.setRating(15);
        Student student2 = new Student("Volodymyr");
        student2.setRating(30);

        students.add(student1);
        students.add(student2);

        assertEquals("Average rating is wrong", Student.getAvgRating(), 22.5d);
    }

    @Test
    public void testGetName() {
        Student student = new Student("Petro");

        students.add(student);

        assertEquals(student.getName(), "Petro", "Student's name is wrong");
    }

    @Test
    public void testSetName() {
        Student student = new Student("Petro");
        student.setName("Volodymyr");

        students.add(student);

        assertEquals(student.getName(), "Volodymyr", "Student's name is wrong");
    }

    @Test
    public void testGetRating() {
        Student student1 = new Student("Volodymyr");

        students.add(student1);

        assertEquals("Student.Student's name is wrong", student1.getRating(), 0);

        Student student2 = new Student("Petro");
        student2.setRating(51);

        students.add(student2);

        assertEquals("Student.Student's name is wrong", student2.getRating(), 51 );
    }

    @Test
    public void testSetRating() {
        Student student = new Student("Volodymyr");
        student.setRating(30);

        students.add(student);

        assertEquals("Student.Student's name is wrong", student.getRating(), 30);
    }

    @Test
    public void testBetterStudent() {
        Student student1 = new Student("Petro");
        student1.setRating(15);

        students.add(student1);

        Student student2 = new Student("Volodymyr");
        student2.setRating(30);

        students.add(student2);

        assertFalse(student1.betterStudent(student2),
                student1 + " is not better than " + student2);

        Student student3 = new Student("Petro");
        student3.setRating(51);

        students.add(student3);

        Student student4 = new Student("Volodymyr");
        student4.setRating(30);

        students.add(student4);

        assertTrue(student3.betterStudent(student4),
                student1 + " is not better than " + student2);
    }

    @Test
    public void testChangeRating() {

        assertEquals("Average rating is wrong", Student.getAvgRating(), 0.0d);

        Student student1 = new Student("Petro");
        student1.setRating(15);

        students.add(student1);

        Student student2 = new Student("Volodymyr");
        student2.setRating(30);

        students.add(student2);

        assertEquals("Average rating is wrong", Student.getAvgRating(), 22.5d);

        student2.changeRating(51);

        assertEquals("Average rating is wrong", Student.getAvgRating(), 33.0d);
    }

    @Test
    public void testToString() {
        Student student = new Student("Petro");
        student.setRating(51);

        students.add(student);

        assertTrue(student.toString().contains("Petro"),
                "toString method does not contains student's name");

        assertTrue(student.toString().contains("51"),
                "toString method does not contains student's rating");
    }

    @AfterMethod
    public void tearDown() {
        students.forEach(Student :: removeStudent);
        students.clear();
    }
}