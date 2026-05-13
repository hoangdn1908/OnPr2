package University_Course_Registration_System;

public interface DataManager<T> {
    void add(T item);
    void delete(T item);
    T findById(int id);
    void getAll();
}
