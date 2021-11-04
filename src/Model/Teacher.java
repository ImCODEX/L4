package Model;

import java.util.List;
import java.util.Objects;

public class Teacher extends Person{
    private List<Course> courses;

    public Teacher(String firstName, String lastName, List<Course> courses_) {
        super(firstName, lastName);
        courses = courses_;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public boolean equals(Object o){
        if (this == o ) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(getFirstName(), teacher.getFirstName()) && Objects.equals(getLastName(), teacher.getLastName());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName= " + getFirstName() +
                " lastName= " + getLastName() +
                '}';
    }
}
