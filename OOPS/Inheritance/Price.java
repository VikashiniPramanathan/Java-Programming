
// HIERARCHICAL INHERITANCE

package OOPS.Inheritance;
public class Price {
    void p(){
        System.out.println("price class");
    }
}
class Rice extends Price{
    void r(){
        System.out.println("rice class");
    }
}
class veg extends Price{
    void v(){
        System.out.println("veg class");
    }
}
class Testing1{
    public static void main(String args[]){
       Rice v=new Rice();
       v.r();
       v.p();
    }
}