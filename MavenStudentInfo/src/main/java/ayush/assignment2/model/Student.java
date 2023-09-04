// Full Name : Ayush Joshi
// Student ID#: 154983217
// Email : ajoshi64@myseneca.ca
// Section : NAA
// Authenticity Declaration:
// I declare this submission is the result of my own work and has not been shared with any other student or 3rd party content provider. 
// This submitted piece of work is entirely of my own creation.
package ayush.assignment2.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("Student")
public class Student {

    @Id
    private String id;
    private long studentNumber;
    private String name;
    private String email;
    private float gpa;
    private List<String> courseList;

    public Student() {
    }

    public Student(String id, long studentNumber, String name, List<String> courseList, float gpa) {
        this.id = id;
        this.studentNumber = studentNumber;
        this.name = name;
        this.courseList = courseList;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<String> courseList) {
        this.courseList = courseList;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", studentNumber=" + studentNumber +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gpa=" + gpa +
                ", courseList=" + courseList +
                '}';
    }
}