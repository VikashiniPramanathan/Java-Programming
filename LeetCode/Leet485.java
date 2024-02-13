package LeetCode;
import java.util.*;
public class Leet485 {
    public static void main(String[] args){
      //  int[] a={1,1,0,1,1,1};
        int[] a={1,0,1,1,0,1};
        int count=0;
        int maxcount=0;
        for(int i=0;i<a.length;i++){
             count=0;
            for(int j=i;j<a.length;j++){
                if(a[j]==1){
                    count++;
                    maxcount=Math.max(maxcount,count);
                }
                else {
                    break;
                }
            }
        }
        System.out.println(maxcount);
    }
}
