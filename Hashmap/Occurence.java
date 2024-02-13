package Hashmap;
import java.util.*;
public class Occurence {
    public static void main(String args[]){
        String str="vikaashini";
        char[] a=str.toCharArray();
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for (int i=0;i<str.length();i++) {

            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i])+ 1);


            } else {
                map.put(a[i], 1);
            }
        }


            for(Map.Entry entry:map.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }


    }
}
