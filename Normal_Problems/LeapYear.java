package Normal_Problems;

public class LeapYear {
  /*  public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
            else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int year = 2016;
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

   */
    public static void main(String args[]){
        int n=2024;
        if(n%4==0 || n%100==0 || n%400==0){
            System.out.println("leap year");
        }
        else{
            System.out.println("not leap year");
        }
    }
}
