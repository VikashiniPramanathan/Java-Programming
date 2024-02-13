package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Duplicate {
    public static void main(String args[]){
        String str="Hello";
        String str2=str.toLowerCase();
        System.out.println(str2);
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str2.length();i++){
            if(map.containsKey(str2.charAt(i))){
                map.put(str2.charAt(i),map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i),1);
            }

        }
        for(Map.Entry<Character,Integer> val: map.entrySet()){
            if(val.getValue()>1){
                System.out.print(val.getKey());
            }
        }


    }
}
