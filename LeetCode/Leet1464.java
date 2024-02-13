package LeetCode;

public class Leet1464 {
    public static void main(String[] args){
      // int[] a={3,4,5,2};
     //  int[] a={1,5,4,5};
       int[] a={3,7};
        int max=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                int multi=0;
                multi=(a[i]-1)*(a[j]-1);
                if(max < multi){
                    max=multi;
                }
            }

        }
        System.out.println(max);
    }
}
