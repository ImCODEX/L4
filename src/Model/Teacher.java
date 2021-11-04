package Model;

import java.util.List;
import java.util.Objects;

/**
 * Teacher Class
 */

public class Teacher extends Person{
    private List<Course> courses;

    /**
     * Teacher Constructor
     * @param firstName: String
     * @param lastName: String
     * @param courses_: List<Course>
     */
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

    /**
     * Equals method for comparison
     * Used especially in update() method from InMemoryRepository.java
     * @param o: another Teacher Object
     * @return: boolean
     */
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
