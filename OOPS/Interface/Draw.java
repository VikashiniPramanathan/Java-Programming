package OOPS.Interface;

interface Draw {
    void drawing();
}
class Rectangle implements Draw{
    public void drawing(){
        System.out.println("drawing rectangle");}
}
class Circle implements Draw{
    public void drawing(){
        System.out.println("drawing circle");}
}

class TestInterface1{
    public static void main(String args[]){
        Draw d=new Circle();
        d.drawing();
    }
}
