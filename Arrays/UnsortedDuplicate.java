package Arrays;

public class UnsortedDuplicate {
    public static void main(String args[]){
        int a[]={3,4,2,2,3,5,6,7,2,5};
        int j,g=0;
        int n=a.length;
        for(int i=0;i<a.length;i++){
            for(j=i+1,g=0;j<a.length;j++){
                if(a[i]==a[j]){
                    g=1;
                    System.out.print(a[i]);
                    break;
                }
            }
            if(g==0){
                System.out.print(a[i]+" ");
            }
        }
    }
}
