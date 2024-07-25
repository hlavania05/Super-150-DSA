package Sem4.lecture35;

public class Person_Client {
    public static void main(String[] args) throws Exception{
        Person p = new Person("Raj", 18);
        p.setAge(-9);
        System.out.println(p.getName() + " " + " " + p.getAge());
    }
}
