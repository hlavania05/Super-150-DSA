package Sem4.lecture34;
// class -> blueprint -> ek dhancha tayyar krna ...for example ghar ka architeture jo banate h pen paper par
// object -> jab class ki functionalities ko use krte h
// s --> reference variable
// this -> class ke data element or method ke variable ko diferentiate krne ke lie this keyword use krte h
// static method -> class ka data member access nhi hoga.....class ke non-static variable ko access nhi kr sakte
// static block --> object banne se just pahle ye run hota h vo bhi sirf ke baar

public class Student {
    String name;
    int age;
    public void Intro(){
        System.out.println("My Name is " + name + " and age is " + age);
        //this key word isie use nhi kiya kyuki yha koi conflict nhi tha
    }
    public void SayHii(String name){
        System.out.println(this.name + " says, hey " + name);
        //  this key word islie use kia h kyuki yha conflict ho rha h...yha name ke do variable h
        // this.name --> class ka name lega
        // name --> ye jo parameter me pass hua h vo yha use hoga
    }

    public static void Mentor_name(){
        System.out.println("Mentor name is : Monu Bhaiya");
    }

    // Static Block --> jab object create hota h to usse pahle ye static block chalta h
    static{
        System.out.println("I am in static Block");
    }
}
