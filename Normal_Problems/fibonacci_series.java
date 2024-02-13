package Normal_Problems;
import java.util.*;
public class fibonacci_series {
    public static void main(String args[]){
        int a=0,b=1,c=0;
        System.out.println("Enter value of n : ");
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        System.out.println(" "+a);
        System.out.println(" "+b);
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        System.out.print(a);
        System.out.print(b);
     //   System.out.println(c);

    }
}
