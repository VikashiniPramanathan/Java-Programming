package OOPS.Polymorphism;

public class Rate {
    int price=90;
}
class Rice extends Rate {
    int price = 150;

    public static void main(String args[]) {
        Rate obj = new Rate();
        System.out.println(obj.price);
    }
}

//NOTE: Runtime polymorphism can't be achieved by data members.
