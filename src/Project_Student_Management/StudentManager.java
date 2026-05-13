package Project_Student_Management;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;

public class StudentManager<T extends Student>  implements Serializable {
     private ArrayList<T> list;

     public StudentManager()
     {
         list = new ArrayList<>();
     }

     public void add(T student)
     {
         if(!list.isEmpty())
         {
            if(findStudent(student.getId()) != null)
                throw new IllegalArgumentException("Duplicate id: " + student.getId());
         }
         list.add(student);
         sortStudent();
     }

     public void remove(int id)
     {
         if(list.isEmpty())
             throw new IllegalArgumentException("The list is empty.");
         T student = findStudent(id);
         if(student == null)
             throw new IllegalArgumentException("Not found by id: " + id);
         list.remove(student);
     }

     public T search(int id)
     {
         return findStudent(id);
     }


     public void displayAll()
     {
         for(T student : list)
         {
             System.out.println(student);
         }
     }

     private void sortStudent()
     {
         for(int i = 0; i < list.size() - 1; i++)
         {
             for(int j = i; j < list.size() - 1 - i; j++)
             {
                 if(list.get(j).getId() > list.get(j + 1).getId())
                 {
                     T temp = list.get(j);
                     list.set(j, list.get(j + 1));
                     list.set(j + 1, temp);
                 }
             }
         }
     }

     private T findStudent(int id)
     {
         for(T studentInList : list)
         {
             if(studentInList.getId() == id)
             {
                 return studentInList;
             }
         }
         return null;
     }

     public void save(String fileName)
     {
         try
         {
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
             objectOutputStream.writeObject(list);
             objectOutputStream.close();
         }
         catch (IOException e)
         {
             System.out.println(e.getMessage());
         }
     }

     public void load(String fileName)
     {
         try {
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
             list = (ArrayList<T>) objectInputStream.readObject();
             objectInputStream.close();
         }
         catch (IOException | ClassNotFoundException e)
         {
             System.out.println(e.getMessage());
         }
     }
}

