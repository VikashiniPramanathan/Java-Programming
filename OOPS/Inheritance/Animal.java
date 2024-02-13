// MULTILEVEL INHERITANCE

package OOPS.Inheritance;

public class Animal {
    void run(){
        System.out.println("animal class");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("dog class");
    }
}
class Cow extends Dog{
    void graze(){
        System.out.println("cow class");
    }
}

class Testing{
    public static void main(String args[]){
     Cow c=new Cow();
     c.graze();
     c.eat();
     c.run();

    }
}
