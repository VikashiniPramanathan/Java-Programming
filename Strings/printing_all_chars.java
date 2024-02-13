package Strings;
import java.util.*;
public class printing_all_chars {
    public static void main(String args[]){
        System.out.println("Enter the string ");
        Scanner sc=new Scanner(System.in);

        String str1=sc.nextLine();
        for(int i=0;i<str1.length();i++){
            System.out.println(str1.charAt(i));

        }
        System.out.println("Length of the string is "+str1.length());
    }
}

