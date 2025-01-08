package Sem5.lecture46;

public class Abstract_client {
    public static void main(String[] args) {
        // Abstract_Demo ab = new Abstract_Demo();
        Parent_abstractClass ab = new Parent_abstractClass();
        ab.YourName();
        ab.sayHello();



        // ----Anonymous way to create Object of Object Class : Feature of Java 8-------
        Abstract_Demo ab1 = new Abstract_Demo() {
            @Override
            public void payment() {

            }

            @Override
            public void no_of_items() {

            }
        };
    }
}
