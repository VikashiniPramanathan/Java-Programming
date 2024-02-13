package Hashmap;
import java.util.*;
public class MaxFreq {
    public static void main(String args[]){
        int arr[]={2,12,2,11,12,2,1,2,2,11,12,2,6};
       // int arr[]={1,4,5};

        HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<arr.length;i++){
        //   int maxcount=0;
           if(map.containsKey(arr[i])){
               map.put(arr[i],map.get(arr[i])+1);

           }
           else{
               map.put(arr[i],1);
           }
       }

        System.out.println(map);

        int max=0, res=Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> val: map.entrySet()){
            if(max<val.getValue()){
                res= val.getKey();
                max= val.getValue();
            }
        }
        System.out.println(res);
        System.out.println(max);


    }
}
