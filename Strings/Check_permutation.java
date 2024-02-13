package Strings;

import java.util.HashMap;

public class Check_permutation {
    public static void main(String args[]){
//        String str="abcde";
        String str="abc";
        str=str.toLowerCase();
//        String str2="baedc";
        String str2="cbd";
        str2=str2.toLowerCase();
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        for(int i=0;i<str.length();i++){

                map.put(str.charAt(i),1);

        }
        for(int i=0;i<str2.length();i++){

                map2.put(str2.charAt(i),1);

        }
        if(map.equals(map2)){
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
}
