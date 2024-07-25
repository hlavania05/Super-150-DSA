package Sem4.lecture34;

public class Student_Client {
    public static void main(String[] args) {
        Student s= new Student();
        // object is creating by using student class
        // s is a reference variable
        s.name = "kaju";
        s.age = 19;
        s.Intro();  // calling of method of the student class
        s.SayHii("Kunal");

        System.out.println();

        Student s1 = new Student();   // new object is creating by using student class
        s1.name = "kunal";
        s1.age = 22;
        s1.Intro();
        s1.SayHii("Raju");

    }
    // Ques : humne static keyword kyu nhi use kiya idhar ?
    // Ans  : kyuki agar static sue krte toh phr method ke andar class ka variable use nhi kr pate
}
