package Sem4.lecture35;

public class Student {
    private String name = "Raj";
    private int age = 19;

    // Constructor
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Getter
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    // Setter
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
