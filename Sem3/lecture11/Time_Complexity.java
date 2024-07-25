package Sem1.lecture11;
/* time complexity :
 hum us program ko prefer krte h jiski time complexity kam ho

 two type to find time-complexity :
 1) experimental way : depends on hardware/system. we avoid to use this way
 2) asymptotic notation :
    (i) Big-Oh notation : Worst Case (Jitna time jyda lagega): O(gn)
    (ii) omega notation : best Case (jitna time kam lagega)

Ques : find time complexity - f(n) = n^2 + 4n + 9
       c = 14 and g(n) = n^2
       n^2 + 4n + 9 <= 14n^2 ?
       time complexity = n^2

code ki complexity kese nikale?

 */
public class Time_Complexity {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for(int i=0; i<1000000; i++){

        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
