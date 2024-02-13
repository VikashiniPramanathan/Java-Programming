package Hashmap;
import java.util.*;
public class Remove_duplicate {
    public static void main(String args[]){
        int a[]={3,2,5,3,2,1,6,-1,5};
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i] + 1));
            }
            else{
                map.put(a[i],1);
            }

        }
        //System.out.print(map.keySet());
          Set<Integer> s=map.keySet() ;
            for(Integer i:s){
                System.out.print(i+" ");
            }

        }
    }

