package OOPS.Polymorphism;
// runtime polymorphism


public class Bike {
    void run(){
        System.out.println("bike running");
    }
}
class Splender extends Bike{
    void run(){
        System.out.println("splender class");
    }
    public static void main(String args[]){
        Bike s=new Splender();
        s.run();
    }
}

