package Hashmap;
import java.util.*;
public class Inbuilt {
    public static void main(String args[]){
        HashMap<String,Integer> map=new HashMap<>();

        //insert
        map.put("abc", 1);
        map.put("vbf",4);
        if(map.containsKey("abc")){
            System.out.println("map is present");
        }
        if(map.containsKey("dfg")){
            System.out.println("map is present");
        }
        else{
            System.out.println("map not there");
        }

        //size
        System.out.println("map size: "+map.size());

        //getting value
        int v=map.get("abc");
        System.out.println("fetching value for abc: "+v);



    /*    int v1=map.get("abc1");
        System.out.println(v1);
    */
        //to resolve null-pointer exception
     /*   int v1=0;
        if(map.containsKey("abc")){
            v1=map.get("abc1");
        }
      System.out.println(v1);

      */

     /*   //remove
        map.remove("abc");
        if(map.containsKey("abc")){
            System.out.println("map has abc");
        }
        if(map.containsKey("abc")){  //checking that abc removed or not
            System.out.println("yes present");
        }
        else{
            System.out.println("abc illa");
        }

      */

        //iterate
        Set<String> a=map.keySet();
        for(String s:a){
            System.out.print(s+" ");
        }
    }
}
