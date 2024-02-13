package OOPS.Abstraction;

abstract class Bike {
    abstract void run();
}
class Honda extends Bike {
    void run() {
        System.out.println("honda class");
    }

}
class Testing2{

    public static void main(String args[]){
        Bike b=new Honda();
            b.run();
    }
}
