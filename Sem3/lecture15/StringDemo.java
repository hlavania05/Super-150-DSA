package Sem1.lecture15;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        System.out.println(str1 == str3);  // false
        System.out.println(str1 == str2);  // true
        System.out.println(str3 == str4);  // false
        System.out.println(str1);  // str1 me address jayega but jab print krte h to content print hota h

        str1 = str1 + " world";
        System.out.println(str1);

        String s1 = "kaju" + "kamlesh";
        System.out.println(s1);
    }
}
