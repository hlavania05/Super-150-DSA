package Sem5.lecture47;

public class Cars implements Comparable<Cars>{
    int price;
    int speed;
    String color;
    public Cars(){

    }
    public Cars(int price, int speed, String color){
        this.price = price;
        this.speed = speed;
        this.color = color;
    }
    public String toString(){
        return "P " + price + " S " + speed + " C " + color;
    }
    public int compareTo(Cars other){
        return this.price - other.price;
    }
}
