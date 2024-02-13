package Arrays;
import java.util.*;
public class insert_ele {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements of the array : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter posistion:  ");
        int p=sc.nextInt();
        System.out.println("element to be inserted: ");
        int e=sc.nextInt();

        for(int i=n;i>=p;i--){
            a[i+1]=a[i];
        }

        a[p]=e;
        //for(int i=0;i<n;i++){
        System.out.println(a[p]);
    }
}
