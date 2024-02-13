package Normal_Problems;
import java.util.*;
public class division_without_oper {
    public static void main(String args[]){
        int count=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(a>=b){
            a=a-b;
            count++;
        }
        System.out.println(count);
    }
}
