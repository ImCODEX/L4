package Test;

import Model.Course;
import Model.Person;
import Model.Student;
import Model.Teacher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Test Class for Model
 */

public class ModelTest {
    private Course courseBazeDeDate;
    private Course courseStructuriDeDate;
    private Student studentRazvan;
    private Student studentMarius;
    private Student studentAndrei;
    private Student studentCodrut;
    private Teacher teacherDorel;
    private Teacher teacherDor;

    /**
     * Setup method
     * instantiates various Teacher, Student, Course Objects
     * also instantiates various ArrayLists for complete
     * declaration of Teacher, Student, Course Objects
     */
    @BeforeEach
    public void setup(){
        teacherDorel = new Teacher("Dorel", "Bob", new ArrayList<>());
        teacherDor = new Teacher("Dor", "Dob", new ArrayList<>());
        studentRazvan = new Student("Razvan", "Postescu", 103050, 0, new ArrayList<>());
        studentMarius = new Student("Marius", "Pop", 103051, 0, new ArrayList<>());
        studentAndrei = new Student("Andrei", "Marian", 103052, 0, new ArrayList<>());
        studentCodrut = new Student("Codrut", "Irimie", 103053, 0, new ArrayList<>());
        courseBazeDeDate = new Course("Baze de date", teacherDorel, 5, new ArrayList<>(), 6);
        courseStructuriDeDate = new Course("Structuri de date si algoritmi", teacherDor, 2, new ArrayList<>(), 5);
        
        List<Course> teacherDorelCourses = new ArrayList<>();
        teacherDorelCourses.add(courseBazeDeDate);
        teacherDorel.setCourses(teacherDorelCourses);

        List<Course> teacherDorCourses = new ArrayList<>();
        teacherDorCourses.add(courseStructuriDeDate);
        teacherDor.setCourses(teacherDorCourses);
        
        List<Student> courseBazeDeDateStudents = new ArrayList<>();
        courseBazeDeDateStudents.add(studentRazvan);
        courseBazeDeDateStudents.add(studentMarius);

        List<Course> studentRazvanCourses = new ArrayList<>();
        studentRazvanCourses.add(courseBazeDeDate);
        studentRazvan.setEnrolledCourses(studentRazvanCourses);

        List<Course> studentMariusCourses = new ArrayList<>();
        studentMariusCourses.add(courseBazeDeDate);
        studentMarius.setEnrolledCourses(studentMariusCourses);

        List<Student> courseStructuriDeDateStudents = new ArrayList<>();
        courseStructuriDeDateStudents.add(studentAndrei);
        courseStructuriDeDateStudents.add(studentCodrut);

        List<Course> studentAndreiCourses = new ArrayList<>();
        studentAndreiCourses.add(courseStructuriDeDate);
        studentAndrei.setEnrolledCourses(studentAndreiCourses);

        List<Course> studentCodrutCourses = new ArrayList<>();
        studentCodrutCourses.add(courseStructuriDeDate);
        studentCodrut.setEnrolledCourses(studentCodrutCourses);

        List<Teacher> courseBazeDeDateTeachers = new ArrayList<>();
        List<Teacher> courseStructuriDeDateTeachers = new ArrayList<>();
        courseBazeDeDateTeachers.add(teacherDorel);
        courseBazeDeDateTeachers.add(teacherDor);
                
    }

    /**
     * Test for toString() methods
     * of Teacher, Student, Course Objects
     */
    @Test
    public void printAll(){
        System.out.println(studentRazvan.toString());
        System.out.println(studentMarius.toString());
        System.out.println(studentAndrei.toString());
        System.out.println(studentCodrut.toString());
    }

    /**
     * Test for good insertion of ArrayList<Course> in Student Class
     * and good functionality of Class Student getter
     */
    @Test
    public void testEnrolledCourses(){
        List<Course> studentRazvanCourses = new ArrayList<>();
        studentRazvanCourses.add(courseBazeDeDate);
        assertEquals(studentRazvan.getEnrolledCourses(), studentRazvanCourses);

        List<Course> studentMariusCourses = new ArrayList<>();
        studentMariusCourses.add(courseBazeDeDate);
        assertEquals(studentMarius.getEnrolledCourses(), studentMariusCourses);

    }


    /**
     * Test for good insertion of ArrayList<Course> in Teacher Class
     * and good functionality of Class Teacher getter
     */
    @Test
    public void testListOfCourses(){
        List<Course> teacherDorelCourses = new ArrayList<>();
        teacherDorelCourses.add(courseBazeDeDate);
        assertEquals(teacherDorel.getCourses(), teacherDorelCourses);
    }

    /**
     * Test for good insertion of Teacher in Course Class
     */
    @Test
    public void testCoursesTeacher(){
        assertEquals(courseBazeDeDate.getTeacher(), teacherDorel);
        assertNotEquals(courseBazeDeDate.getTeacher(), teacherDor);

        assertEquals(courseStructuriDeDate.getTeacher(), teacherDor);
        assertNotEquals(courseStructuriDeDate.getTeacher(), teacherDorel);
    }
    
}
