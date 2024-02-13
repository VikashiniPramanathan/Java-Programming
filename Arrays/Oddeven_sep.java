package Arrays;
import java.util.*;
public class Oddeven_sep {
    public static void main(String args[]) {
        int[] arr = {13, 2, 4, 15, 12, 10, 5};//13,2,12,10,5,15,4
        int n=arr.length;
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        int[] res=new int[n];
        for (int i = 0; i <n; i++) {
            if(i%2==0){
                arr1[i]=arr[i];

            }
            else
                arr2[i]=arr[i];

        }
        //arr1=13,0,4,0,12,0,5
        for (int i = 0; i <n; i+=2) {
            for (int j = i+2; j <n; j+=2) {
                if (arr1[i] < arr1[j] ){
                    int temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }
        for (int i = 1; i <n; i+=2) {
            for (int j = i+2; j <n; j+=2) {
                if (arr2[i] > arr2[j] ){
                    int temp=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                }
            }

        }

    //   System.out.println(Arrays.toString(arr1)+" "+Arrays.toString(arr2));
        for (int i = 0; i <n; i++) {
            if (i % 2 == 0) {
                res[i] = arr1[i];
            } else {
                res[i] = arr2[i];
            }
            // System.out.println(Arrays.toString(res));
            System.out.print(res[i] + " ");
        }
    }

}


