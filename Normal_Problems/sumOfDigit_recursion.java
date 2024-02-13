package Normal_Problems;
import java.util.*;
public class sumOfDigit_recursion {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        else{
            return(n%10+sum(n/10));
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=sum(n);
        System.out.println("Sum of digits of "+n+" is: "+res);
    }
}
