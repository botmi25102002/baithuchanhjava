package baithuchanhngay2504;

Interface Car {
    void move();
    void stop();
    void turnRight();
    void turnLeft();
    void reverse();
}
public class TaxiCar extends Person implements Car{
    public String address;
    public TaxiCar(String address){
        this.address = address;
    }
    public void move(){
        System.out.println(" Move to: " + address);
    }
}
