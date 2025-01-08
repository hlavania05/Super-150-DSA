package HashMap_Assignment_9;
import java.util.*;
class employee implements Comparable<employee>{
    String name;
    int salary;
    public employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.name + " " + this.salary;
    }

    @Override
    public int compareTo(employee other) {
        if(other.salary != this.salary){
            return Integer.compare(other.salary, this.salary);
        }
        else {
            return this.name.compareTo(other.name);
        }
    }
}
public class Sort_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int threshold = sc.nextInt();
        int noe = sc.nextInt();
        PriorityQueue<employee> maxHeap = new PriorityQueue<>();
        for(int i=0; i<noe; i++){
            String name = sc.next();
            int salary = sc.nextInt();
            if(salary >= threshold){
                employee e = new employee(name, salary);
                maxHeap.add(e);
            }
        }
        while (!maxHeap.isEmpty()) {
            employee employee = maxHeap.poll();
            System.out.println(employee);
        }
    }
}
