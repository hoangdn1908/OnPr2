package University_Course_Registration_System;

public abstract class Person {
    private int id;
    private String name;
    private String email;

    public Person(int id, String name,  String email)
    {
        setId(id);
        setName(name);
        setEmail(email);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new InvalidEmailException("Invalid email format!");
        }
        this.email = email;
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

    public abstract void displayInfo();
}
