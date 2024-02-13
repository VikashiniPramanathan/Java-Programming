package Arrays;

public class Summa {
    public static void main(String args[]){
        int[] a ={1, 2, 3, -4, -1, 4};
        int n=a.length;
        int[] pos=new int[n];
        int[] neg =new int[n];
        int[] result =new int[n];
        for(int i=0;i<n;i++){
            if(a[i]>0){
                pos[i]=a[i];
            //    System.out.print(pos[i]+" ");
            }
            else{
                neg[i]=a[i];
             //   System.out.print(neg[i]+" ");
            }

        }
        for(int i=0;i<n;i++){
            if(a[i]>0){
                result[i]=pos[i];
            }
            else{
                result[i]=neg[i];
            }
            System.out.print(result[i]+" ");
        }

    }
}
