package Sem5.lecture48;
import java.util.*;

public class Heap {
    private ArrayList<Integer> ll = new ArrayList<>();
    public void add(int item){
        ll.add(item);
        unheapify(ll.size()-1);
    }
    private void unheapify(int ci){
        int pi = (ci-1)/2;
        if(ll.get(pi) > ll.get(ci)){
            swap(pi, ci);
            unheapify(pi);
        }
    }
    public int remove(){
        swap(0, ll.size()-1);
        int rv = ll.remove(ll.size()-1);
        downHeapify(0);
        return rv;
    }
    private void downHeapify(int pi){
        int lci = 2*pi + 1;
        int rci = 2*pi + 2;
        int min = pi;
        if(lci < ll.size() && min > ll.get(lci)){
            min = ll.get(lci);
        }
        if(rci < ll.size() && min > ll.get(rci)){
            min = ll.get(rci);
        }
        if(min != pi){
            swap(min, pi);
            downHeapify(min);
        }
    }
    public int get(){
        return ll.get(0);
    }
    public int size(){
        return ll.size();
    }
    public void Display(){
        System.out.println(ll);
    }
    private void swap(int pi, int ci){
        int pith = ll.get(pi);
        int cith = ll.get(ci);
        ll.set(pi, cith);
        ll.set(ci, pith);
    }
}
