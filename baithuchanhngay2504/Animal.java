package baithuchanhngay2504;

abstract class Animal{  
    abstract void eat();
    abstract void sleep();
    abstract void walk();
    abstract void run();
    abstract void roar();
}
class Tiger extends Animal(){
    void roar();
    System.out.println("Tiger: roarrrrr!")
}
