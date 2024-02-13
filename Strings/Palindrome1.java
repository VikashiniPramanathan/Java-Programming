package Strings;
import java.util.*;
public class Palindrome1 {
    public static void main(String args[]){
       String str="A man, a plan, a canal: Panama";
        System.out.println(str.length());
    //    String str="race a car";
   //     String str="0p";
        str=str.toLowerCase();
        String str2="";
        for(int i=0;i< str.length();i++){
            if(str.charAt(i)>='a'&&str.charAt(i)<='z'||str.charAt(i)>='0'&&str.charAt(i)<='9'){
                str2=str2+str.charAt(i);
            }
        }
        String rev="";
        for(int i=str2.length()-1;i>=0;i--){
            rev=rev+str2.charAt(i);
        }
        if(str2.equals(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not");
        }
    }
}
