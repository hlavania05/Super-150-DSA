package HashMap_Assignment_9;
import java.util.*;

public class String_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> s = new ArrayList<>();
        for(int i=0; i<n; i++){
            String str = sc.next();
            s.add(str);
        }
        Collections.sort(s, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.startsWith(s2)){
                    return s2.length() - s1.length();
                }
                else if(s2.startsWith(s1)){
                    return s1.length() - s2.length();
                }
                else{
                    return s1.compareTo(s2);
                }
            }
        });
        for(String item : s){
            System.out.println(item);
        }
    }
}
