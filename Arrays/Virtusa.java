package Arrays;

public class Virtusa {
    public static void main(String[] args){
        int[] a={5,8,3,0,0,7,1};
        int n=a.length;
    //    int b[]=new int[n];
        int k=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                int temp=a[i];
                a[i]=a[k];
                a[k] =temp;
                k++;
            }

        }
        for(int i=0;i<n;i++) {
            System.out.print(a[i] + " ");
        }
    }
}
