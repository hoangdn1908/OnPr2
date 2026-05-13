package University_Course_Registration_System;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentManager implements DataManager<Student>, Serializable {
    private List<Student> studentList;

    public StudentManager()
    {
        studentList = new ArrayList<>();
    }

    @Override
    public void add(Student item)
    {
        if(findById(item.getId()) != null)
            throw new DuplicateStudentException("Duplicate Student: " + item.getName());
        studentList.add(item);
    }

    @Override
    public void delete(Student item)
    {
        if(findById(item.getId()) == null)
            throw new StudentNotFoundException("Not found by id: " + item.getId());
        studentList.remove(item);
    }

    @Override
    public Student findById(int id)
    {
        for (var student : studentList)
        {
            if(student.getId() == id)
            {
                return student;
            }
        }
        return null;
    }

    @Override
    public void getAll()
    {
        for(var student : studentList)
        {
            student.displayInfo();
        }
    }

    public void save(String fileName)
    {
        try
        {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            objectOutputStream.writeObject(studentList);
            objectOutputStream.close();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
