package Normal_Problems;
import java.util.*;
public class happy_num {
    public static int Happy_num(int n) {

        int sum = 0;
        int temp = n;
        int rem = 0;
        while (n != 0) {
            rem = n % 10;
            sum = sum + (rem * rem);
            n = n / 10;
        }
        return sum;
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=n;
        while(result != 1 && result != 4){
            result = Happy_num(result);
        }
        if(result == 1)
            System.out.println(result + " is a happy number");
            //Unhappy number ends in a cycle of repeating numbers which contains 4
        else if(result == 4)
            System.out.println(result + " is not a happy number");
    }
}
