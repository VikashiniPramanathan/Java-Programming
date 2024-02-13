package LeetCode;

public class Leet229 {
    public static void main(String[] args){
        int[] a={3,2,3};
      //  int[] a={1};
      //   int[] a={1,2,3};
        int j=0;
        if(a.length<=1){
            System.out.println(a[0]);
        }
        for(int i=0;i<a.length;i++){
            int count=0;
            for(j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.print(a[i]+" ");
                break;
            }
            System.out.print(a[i]+" ");
        }

    }
}
