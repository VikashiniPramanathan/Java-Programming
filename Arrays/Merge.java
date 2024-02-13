package Arrays;
import java.util.*;
public class Merge {
    public static void main(String args[]){
        int a[]={1,2,3};
        int b[]={2,5,6};
        int res[]=new int[a.length+b.length];
        int n=res.length;
        int k=0;

        // METHOD -1
        for(int i=0;i<a.length;i++){
            res[k]=a[i];
            k++;
        }
        for(int i=0;i<b.length;i++){
            res[k]=b[i];
            k++;
        }
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
            Arrays.sort(res);
        }



        // METHOD -2
  /*      while(i<a.length){
            res[k]=a[i];
            k++;
            i++;
        }
        while(j<b.length){
            res[k]=b[j];
            j++;
            k++;
        }
        for( i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }

   */

        // METHOD -3

    }
}
