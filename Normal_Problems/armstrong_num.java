package Normal_Problems;
import java.util.*;
public class armstrong_num {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem=0;
        int sum=0;
        int temp=n;
        while(n!=0){
            rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }
        if(temp==sum){
            System.out.println(temp+" is an Armstrong number.");
        }
        else{
            System.out.println(temp+" is not an Armstrong number.");
        }
    }
}
