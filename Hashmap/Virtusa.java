package Hashmap;
import java.util.*;
public class Virtusa {
    public static void main(String[] args){
        String str="vikashini";
        char[] arr=str.toCharArray();
        int max=0,check=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:arr){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else
                map.put(c,1);
            System.out.print(map.get(c)+" ");
            if(map.get(c)>=max){
                check=max;
                max=map.get(c);
            }
        }
        System.out.println();
        if(max==check){
            System.out.println("0");
        }else
            System.out.println(max);
    }
}
