/*Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.

        Example 1:
        Input:
        N = 4, K = 6
        arr[] = {1, 5, 7, 1}
        Output: 2
        Explanation:
        arr[0] + arr[1] = 1 + 5 = 6
        and arr[1] + arr[3] = 5 + 1 = 6.

        Example 2:
        Input:
        N = 4, X = 2
        arr[] = {1, 1, 1, 1}
        Output: 6
        Explanation:
        Each 1 will produce sum 2 with any 1.*/

package Arrays;
import java.util.*;
public class sum_equal_to_k {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        int k=sc.nextInt();
        //int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum=a[i]+a[j];
                if(sum==k &&i!=j){
                    //System.out.println(i+""+j);
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
