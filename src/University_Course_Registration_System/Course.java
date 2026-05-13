package University_Course_Registration_System;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Course implements Serializable {
    private int id;
    private String name;
    private int maxStudent;
    private String major;
    private int amountOfStudents;
    private List<Student> enrolledStudents;

    public Course(int id, String name, int maxStudent, String major)
    {
        setId(id);
        setName(name);
        setMaxStudent(maxStudent);
        setMajor(major);
        enrolledStudents = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getMajor() {
        return major;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        if(id < 0)
        {
            throw new InvalidIdException("Invalid id.");
        }
        this.id = id;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty())
            throw new InvalidNameException("Name can not be null or empty");
        if(name.length() > 20)
            throw new InvalidNameException("Name can not be longer than 20.");

        this.name = name;
    }

    public void setMaxStudent(int maxStudent) {
        this.maxStudent = maxStudent;
    }

    public void setMajor(String major) {
        if(major == null || major.trim().isEmpty())
            throw new InvalidMajorException("Major can not be null or empty.");
        this.major = major;
    }

    private Student findStudentById(int id)
    {
        for (var student : enrolledStudents)
        {
            if(student.getId() == id)
            {
                return student;
            }
        }
        return null;
    }

    public boolean isFull()
    {
        return enrolledStudents.size() == maxStudent;
    }

    public void addStudent(Student student)
    {
        if(isFull())
            throw new CourseFullException("This course is full of students.");
        if(!student.getMajor().equals(this.major))
            throw new InvalidMajorException("This student can not enroll this course.");
        if(findStudentById(student.getId()) != null)
            throw new DuplicateStudentException("Duplicate student: " + student.getName());
        enrolledStudents.add(student);
        student.addCourse(this);
        amountOfStudents++;
    }

    public void removeStudent(Student student)
    {
        if(!student.getMajor().equals(this.major))
            throw new InvalidMajorException("This student are not in this course.");
        if(findStudentById(student.getId()) == null)
            throw new StudentNotFoundException("This student are not in this course.");
        enrolledStudents.remove(student);
        student.removeCourse(this);
        amountOfStudents--;
    }

    public void displayInfo()
    {
        System.out.println("Id: " + getId() + "| Name: " + getName() + "| Major: " + getMajor() + "| Amount of student: " + amountOfStudents + "| Is full : " + isFull() + ".");
    }
}
