package Hashmap;
import java.util.*;
public class Print_Intersection {
    public static void main(String args[]) {
       int a1[] = {1, 5, 10, 20, 40, 80};
       int a2[] = {6, 7, 20, 80, 100};
       int a3[]={3, 4, 15, 20, 30, 70, 80, 120};
   //     int a1[]={1,4,5,2,2,3,6,5,3,2};
   //     int a2[]={0,2,3,2,6,6,5,1};


        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a1.length; i++) {
            map.put(a1[i], 1);
        }
        for(int i=0;i<a2.length;i++){
            if(map.containsKey(a2[i])){
              //  System.out.print(a2[i]+" ");
            }
        }
        for(int i=0;i<a3.length;i++){
            if(map.containsKey(a3[i])){
                System.out.print(a3[i]+" ");
            }
        }

    /*
     for(int i=0;i<a2.length;i++){
         int k=0;
         if(map.containsKey(a2[i])){
             k=1;
         }
         if(k==1){
             System.out.print(a2[i]);
         }
     }
     */

     }
}



