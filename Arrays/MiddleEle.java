
package Arrays;
import java.util.*;
public class MiddleEle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       if(a.length %2==0){
            int m=a[(a.length/2)-1];
            System.out.println("the m value: "+m);
            int p=a[a.length/2];
            System.out.println("the p value: "+p);
        }
        else {
            int y = a[a.length / 2];
            System.out.println("the y value: "+y);
        }

    }
}
