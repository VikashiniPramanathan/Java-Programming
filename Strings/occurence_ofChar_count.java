package Strings;
import java.util.*;
public class occurence_ofChar_count {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        char a[]=s.toCharArray();
        Map<Character, Integer>map=new TreeMap<>();

        for(int i=0;i<s.length();i++){
            for(int j=1;j<s.length();j++){
                count=0;
                if(a[i]==a[j]){
                    count++;
                }
            }
            map.put(a[i],count);
        }
        System.out.println(count);
    }
}
