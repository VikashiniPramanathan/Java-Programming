/*
Example:
       Input: kyoto
       Output: tokyo
 */

package Strings;
import java.util.*;
public class Rotate {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        int n=s1.length();
        char[] c=s1.toCharArray();
        for(int i=0;i<n;i++){
        //    System.out.print(c[(i+(n-2))%n]);
            System.out.print(c[(i+3)%n]);
        }
    }
}
