package LeetCode;

public class ContainsWater {
    public static void main(String[] args){
        int[] a={1,8,6,2,5,4,8,3,7};
     //   int[] a={1,1};
        int max=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                int local=Math.abs(i-j)*Math.min(a[i],a[j]);
                max=Math.max(max,local);
            }
        }
        System.out.println(max);
    }
}
