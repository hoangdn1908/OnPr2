package University_Course_Registration_System;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class Student extends Person implements Serializable {
    private double gpa;
    private String major;
    private List<Course> courses;

    public Student(int id, String name, String email, double gpa, String major)
    {
        super(id, name, email);
        setGpa(gpa);
        setMajor(major);
        courses = new ArrayList<>();
    }

    public double getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setGpa(double gpa) {
        if(gpa < 0 || gpa > 4)
            throw new InvalidGPAException("Invalid Gpa.");
        this.gpa = gpa;
    }

    public void setMajor(String major) {
        if(major == null || major.trim().isEmpty())
            throw new InvalidMajorException("Major can not be null or empty.");
        this.major = major;
    }

    private Course findCourseById(int id)
    {
        for(var course : courses)
        {
            if(course.getId() == id)
                return course;
        }
        return null;
    }

    public void addCourse(Course course)
    {
        if(findCourseById(course.getId()) != null)
            throw new DuplicateCourseException("Duplicate course: " + course.getName());
        course.addStudent(this);
        courses.add(course);
    }

    public void removeCourse(Course course)
    {
        if(findCourseById(course.getId()) == null)
            throw new CourseNotFoundException("Not found this course.");
        course.removeStudent(this);
        courses.remove(course);
    }

    @Override
    public void displayInfo() {
        System.out.println("Id " +  super.getId() + "| Name: " + super.getName() + "| Email: " + super.getEmail() + "| GPA: " + getGpa() + "| Major: " + getMajor() + ".");
        System.out.println("---Course---");
        for(var course : courses)
        {
            course.displayInfo();
        }
    }
}
