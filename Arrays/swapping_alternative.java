package Arrays;

public class swapping_alternative {
    public static void main(String args[]) {
        int a[] = {1,2,3,4,5};
        int n = a.length;
/*        for(int i=0;i<n;i=i+2){
            for(int j=i+1;j<n;j++){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;

                break;

            }
        }

 */
        for(int i=0;i<n-1;i+=2){
            int temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print("\t"+a[i]);
        }
    }
}
