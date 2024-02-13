package Hashmap;

import java.util.*;
import java.util.Map;

public class Intro {
    public static void main(String args[]){
       LinkedHashMap<Integer,String> em=new LinkedHashMap<>();
        // insert element
        em.put(1,"vikaash");
        em.put( 2 ,"arun");
        em.put(3,"monish");
       em.put(2,"monish");
        em.put(3,"vikaash");
        System.out.println(em);


        LinkedHashMap<String,Integer> em3=new LinkedHashMap<>();
        em3.put("abc",1);
        em3.put("mno",2);
        em3.put("lkj",7);
        em3.put("abc",7);
        System.out.println(em3);




      /*  //copy of existing map
        HashMap<Integer,String> em2=new HashMap<Integer,String>();
        em2.putAll(em);
        System.out.println("dupliacted: "+em2);

        //clear duplicate
        em2.clear();
        System.out.println("after clearing: "+em2);

        //checking for key
        System.out.println("does key one present: "+em.containsKey(1));
        System.out.println("does key one present: "+em.containsKey(6));

        //checking for value
        System.out.println("value");
    }

       */
}}

