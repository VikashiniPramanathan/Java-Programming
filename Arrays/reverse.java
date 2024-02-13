package Arrays;
import java.util.*;
public class reverse {
    public static void main(String args[]){
        /*/ int a[]={1,2,3,4,5,6};
        for(int i=5-1;i>=0;i--){
            System.out.println(""+a[i]);
        }*/
        System.out.println("Enter array size: ");
        Scanner sc = new Scanner(System.in) ;
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("orginal string is: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("reversed string is: ");
        for(int i=n-1;i<a.length;i--){
            System.out.println(""+a[i]);
        }
    }
}
