package Arrays;
// right rotate
public class rotate {
    public static void main(String args[]) {
 /*       int arr1[]={1,2,3,4,5};
        int arr2[]=new int [arr1.length];
        int value=1,k=0;
        for(int i=arr1.length-1;i>=value-1;i--){
            arr2[k]=arr1[i];
            k++;
        }
        for(int i=0;i<=value-2;i++){
            arr2[k]=arr1[i];
            k++;
        }
        for(int i=0;i<arr2.length;i++){
            System.out.print("\t"+arr2[i]);
        }

  */


      /* for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[(arr1.length+i-value)%(arr1.length)];
        }*/

        // ROTATE BY ONE
        //INPUT : a[]={1,2,3,4,5}
        // OUTPUT : a[]={5,1,2,3,4}
        int a[]={1,2,3,4,5};
        int n=a.length;
       int last=a[n-1];
        for(int i=n-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=last;

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
