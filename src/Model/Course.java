package Model;

import Model.Student;
import Model.Teacher;

import java.util.List;
import java.util.Objects;

public class Course {
    private String name;
    private Teacher teacher;
    private int maxEnrollment;
    private List<Student> studentsEnrolled;
    private int credits;

    public Course(String name, Teacher teacher, int maxEnrollment, List<Student> studentsEnrolled, int credits) {
        this.name = name;
        this.teacher = teacher;
        this.maxEnrollment = maxEnrollment;
        this.studentsEnrolled = studentsEnrolled;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getMaxEnrollment() {
        return maxEnrollment;
    }

    public void setMaxEnrollment(int maxEnrollment) {
        this.maxEnrollment = maxEnrollment;
    }

    public List<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(List<Student> studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public boolean equals(Object o){
        if (this == o ) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(teacher, course.getTeacher()) && Objects.equals(name, course.getName());
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                ", maxEnrollment=" + maxEnrollment +
                ", studentsEnrolled=" + studentsEnrolled +
                ", credits=" + credits +
                '}';
    }
}
