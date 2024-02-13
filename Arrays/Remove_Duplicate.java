package Arrays;
import java.util.*;
public class Remove_Duplicate {
        // METHOD-1
 /*   public static void main(String args[]) {
        int a[]={3,4,1,3,4,1,5,6};
         Arrays.sort(a); //sorting happened
         int n=a.length;
         int arr[]=new int[a.length];
         int k=0;
         for(int i=0;i<n-1;i++){
             if(a[i]!=a[i+1]){
                 arr[k++]=a[i];
             }
         }
         arr[k++]=a[n-1];

         for(int i=0;i<k;i++){
             System.out.print(arr[i]+" ");
         }
     }

 */


        // METHOD-2

        public static void main (String args[]){
            int a[] = {3, 4, 1, 3, 4, 1, 5, 6, -1};
            int n = a.length, g = 1, j = 0;
            for (int i = 0; i < n; i++) {
                for (j = i - 1; j >= 0; j--) {
                    g = 1;
                    if (a[i] == a[j]) {
                        g = 0;
                        break;
                    }
                }
                if (g == 1)
                    System.out.print(a[i] + " ");
            }
        }


 /*

    // METHOD-3
    public static void main(String args[]){
        int[] inputArray = {3, 6, 5, -1, 8, 6, 2, 5, -1};

        int length = inputArray.length;
        int[] uniqueArray = new int[length];
        int uniqueCount = 0,duplicatecount=0;

        for (int i = 0; i < length; i++) {
            int currentElement = inputArray[i];
            boolean isDuplicate = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueArray[j] == currentElement) {
                    isDuplicate = false;
                    duplicatecount++;
                    break;
                }
            }

            if (isDuplicate) {
                uniqueArray[uniqueCount++] = currentElement;
            }
        }

        for (int i = 0; i < length-duplicatecount; i++) {
            System.out.print(uniqueArray[i]+" ");
        }
    }*/

    }




