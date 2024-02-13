package LeetCode;
import java.util.*;
public class Leet2404 {
    public static void main(String[] args){
        int[] nums={0,1,2,2,4,4,1};
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                if(map.containsKey(nums[i])){
                    map.put(nums[i], map.get(nums[i])+1);
                }
                else{
                    map.put(nums[i],1);
                }
            }
        }
        for(Map.Entry<Integer,Integer> val: map.entrySet()){

          //  System.out.println(val.getKey()+"-"+val.getValue());
            if(max < val.getValue()){
                max=val.getValue();

            }
        }
        System.out.println(max);
    }
}
