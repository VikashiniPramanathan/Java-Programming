package Arrays;

public class rotate_left {
    public static void main(String args[]){
        int arr1[]={1,2,3,4,5,6,7};
        int value=3;
        int n=arr1.length;
        int arr2[]=new int[n];
        int k=0;
//left rotate
        for(int i=n-value;i<n;i++){
            arr2[k]=arr1[i];
            k++;
        }
        for(int i=0;i<=value;i++){
            arr2[k]=arr1[i];
            k++;
        }
        for(int i=0;i<n;i++){
            System.out.print("\t"+arr2[i]);
        }


       /* for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[(value+i)%arr1.length]);
        }*/
    }
}
