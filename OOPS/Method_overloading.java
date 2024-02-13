package OOPS;

public class Method_overloading {
    static int  add(int a, int b) {
        return (a + b);
    }

    static double add(double a, int b) {
        return (a + b);
    }
}
     class TestOverloading{
        public static void main(String args[]){
            System.out.println(Method_overloading.add(10,10));
           System.out.println(Method_overloading.add(10.2,10));
        }
    }

