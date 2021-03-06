package Model;

import java.util.List;

/**
 * Student Class
 */

public class Student extends Person{
    private long studentId;
    private int totalCredits;
    private List<Course> enrolledCourses;

    /**
     * Student Constructor
     * @param firstName: String
     * @param lastName: String
     * @param studentId_: int - unique identifier for Student
     * @param totalCredits_: sum of all Courses credits
     * @param enrolledCourses_: List<Course>
     */

    public Student(String firstName, String lastName, long studentId_, int totalCredits_, List<Course> enrolledCourses_) {
        super(firstName, lastName);
        studentId = studentId_;
        totalCredits = totalCredits_;
        enrolledCourses = enrolledCourses_;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    /**
     * Equals method for comparison
     * Used especially in update() method from InMemoryRepository.java
     * @param o: another Student Object
     * @return: boolean
     */
    @Override
    public boolean equals(Object o){
        if (this == o ) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                " studentId= " + studentId +
                " studentName= " + getFirstName() +
                " studentLastName= " + getLastName() +
                ", totalCredits= " + totalCredits +
                ", enrolledCourses= " + enrolledCourses +
                '}';
    }
}
