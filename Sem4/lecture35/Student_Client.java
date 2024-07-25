package Sem4.lecture35;

public class Student_Client {
    public static void main(String[] args) {
        Student s = new Student("Harshita", 20);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        s.setName("Bhoomi");
        System.out.println(s.getName());
        s.setAge(-9);  // this is not a valid age ans still this code is accepting this value
        // to ensure that enter age should be valid we can use Exception handling
        System.out.println(s.getAge());
    }
}
