package Hashmap;
import java.util.*;
public class StringDuplicate{
    public static void main(String[] args){
        String str="CsharpstarZ";
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
            for(int i=0;i<str.length();i++){
                if(!map.containsKey(str.charAt(i))){
                    map.put(str.charAt(i),1);
                }
            }
            for(Map.Entry val:map.entrySet()){
                System.out.print(val.getKey());
            }
    }
}
