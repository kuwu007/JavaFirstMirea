package ru.mirea.task2;

public class Author {
    public Author(String name, String email, char gender)
    {
        this.name=name;
        this.email=email;
        this.gender=gender;
    }

    public String name;
    public String email;
    public char gender;

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email=email;
    }

    public char getGender()
    {
        return gender;
    }

    @Override
    public String toString()
    {
        return '\n'+"Имя:"+ name+'\n'+"Email:"+ email+'\n'+"Пол:"+ gender;
    }
}
