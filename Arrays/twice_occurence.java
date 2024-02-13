/*Given an array of N+2 integers element all elements in the array are in range of 1-N also all elements occur ones except two numbers which occur twice find the two repeating numbers
        input : N=4 arr={1,2,1,3,4,3}
        output:{1,3}*/

package Arrays;
import java.util.*;
public class twice_occurence {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        //int b[]=[a.length];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.print(a[i]+" ");
                }
            }

        }

    }
}
