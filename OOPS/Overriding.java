package OOPS;
public class Overriding {
    int getRateOfInterest() {
        return 0;
    }
}
    class sbi extends Overriding{
        int getRateOfInterest(){
            return 10;
        }
    }
    class axis extends Overriding{
        int getRateOfInterest(){
            return 15;
        }
    }
    class Test{
        public static void main(String args[]){
            sbi s=new sbi();
            axis a=new axis();
            System.out.println("SBI rate of interest: "+s.getRateOfInterest());
            System.out.println("SBI rate of interest: "+a.getRateOfInterest());
        }
    }


