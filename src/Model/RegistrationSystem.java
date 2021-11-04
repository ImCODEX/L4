package Model;

import Model.Course;
import Model.Student;
import Model.Teacher;
import Repo.InMemoryRepository;

import java.util.ArrayList;
import java.util.List;

public class RegistrationSystem {
    private InMemoryRepository<Student> studentInMemoryRepository;
    private InMemoryRepository<Teacher> teacherInMemoryRepository;
    private InMemoryRepository<Course> courseInMemoryRepository;

    public RegistrationSystem(InMemoryRepository<Student> studentInMemoryRepository, InMemoryRepository<Teacher> teacherInMemoryRepository,
                              InMemoryRepository<Course> courseInMemoryRepository) {
        this.studentInMemoryRepository = studentInMemoryRepository;
        this.teacherInMemoryRepository = teacherInMemoryRepository;
        this.courseInMemoryRepository = courseInMemoryRepository;
    }

    public static boolean register(Course course, Student student){
        List<Student> students = course.getStudentsEnrolled();
        if(course.getMaxEnrollment() == students.size())
            return false;
        students.add(student);
        return true;
    }

    public List<Course> retrieveCoursesWithFreePlaces(){
        List<Course> courses = new ArrayList<>();
        for(Course c : courseInMemoryRepository.getAll())
            if(c.getMaxEnrollment() > c.getStudentsEnrolled().size())
                courses.add(c);

        return courses;
    }

    public static List<Student> retrieveStudentsEnrolledForACourse(Course course){
        return course.getStudentsEnrolled();
    }

    public List<Course> getAllCourses(){
        return courseInMemoryRepository.getAll();
    }

}
