package Arrays;

public class EvenOddCombine {
    public static void main(String args[]){
        int a[]={1, 2, 3, -4, -1, 4};
        int n=a.length;
        int poscount=0,negcount=0;
        int pos[]=new int[poscount];
        int neg[]=new int[negcount];

        int p=0,ne=0;

        for(int i=0;i<n;i++){
            if(a[i]>0){
                poscount++;
            }
            else{
                negcount++;
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]>0){
                pos[p++]=a[i];
            }
            else{
                neg[ne++]=a[i];
            }

        }
        int m=0,j=0,k=0;
        while(m<poscount && j<negcount){
            a[k++]=pos[m++];
            a[k++]=neg[j++];
        }
        while(m<poscount){
            a[k++]=pos[m++];
        }
        while (j<negcount){
            a[k++]=neg[j++];
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
