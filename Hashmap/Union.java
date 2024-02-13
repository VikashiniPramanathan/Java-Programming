package Hashmap;
import java.util.*;
public class Union {
    public static void main(String args[]){
        int a1[]={1,2,3,4};
        int a2[]={3,4,5,6};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a1.length;i++){
            map.put(a1[i],1);
        }
        for(int i=0;i<a2.length;i++){
            map.put(a2[i],1);
        }
        for(Map.Entry<Integer,Integer> res: map.entrySet()){
            System.out.print(res.getKey()+" ");
        }
    }
}
