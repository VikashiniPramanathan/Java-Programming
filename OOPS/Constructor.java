package OOPS;

//Default constructor
/*public class Constructor {
    Constructor(){
        System.out.println("Default constructor");
    }
    public static void main(String args[]){
        Constructor o=new Constructor();
    }
}*/


// Paramaterized constructor
public class Constructor{
    int id;
    String name;
    Constructor(int i,String n){
        id=i;
        name=n;
    }
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String args[]){
        Constructor c1=new Constructor(20,"vikaash");
        Constructor c2=new Constructor(14,"monish");
        c1.display();
        c2.display();
    }
}
