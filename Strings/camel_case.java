


package Strings;
import java.util.*;
public class camel_case {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1="";
        str1=str1+Character.toUpperCase(str.charAt(0));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '){
                str1=str1+Character.toUpperCase(str.charAt(i+1));
                i=i+2;
            }
            str1+=str.charAt(i);
        }
        System.out.println(str1);
    }
}
