package Arrays;

import java.util.Arrays;

public class del_at_spec {
    //method -1 :

    public static void main(String args[]){
     int a[]={1,2,3,4,5,3};
        int n=a.length;
        int pos=3;
        int k=0;
        int b[]=new int[n-1];
        for(int i=0;i<pos-1;i++){
            b[k]=a[i];
            k++;
        }
        for(int i=pos;i<a.length;i++){
            b[k]=a[i];
            k++;
        }
        for(int i=0;i<b.length;i++){
            System.out.print("\t"+b[i]);
        }






    }
}
