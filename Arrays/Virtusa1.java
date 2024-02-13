package Arrays;

public class Virtusa1 {
    public static void main(String args[]){
       int a[]={10,5,1,8,4};
     //   int[] a={2,1};
        int res=0;
        int n=a.length;
        res=a[0]-a[n-1];
        for(int i=n-2;i>0;i-=2){
            for(int j=i-1;j>0;j--){
                res=a[i]-a[j]+res;
                break;
            }
        }
        System.out.println(res);
    }
}
