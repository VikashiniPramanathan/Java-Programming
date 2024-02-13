package Normal_Problems;
import java.util.*;
public class multiple_without_oper {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int pro=0;
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=0;i<a;i++){
            pro=pro+b;
        }
        System.out.println(pro);
    }
}
