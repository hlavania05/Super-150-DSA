package Sem1.lecture1;

public class FindGrade {
    public static void main(String[] args) {
        int marks = 97;
        if(marks>=75){
            System.out.println("A");
        }
        else if(marks>=65 && marks<75){
            System.out.println("B");
        }
        else if(marks>=55 && marks<65){
            System.out.println("C");
        }
        else if(marks>=45 && marks<55){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
    }
}
