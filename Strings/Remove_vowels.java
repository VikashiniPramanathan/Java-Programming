package Strings;
import java.util.*;
public class Remove_vowels {
    public static void main(String[] args)
{
    String str, strRes, vowels;
    char ch;
    int i, count, k;
 //   Scanner scan = new Scanner(System.in);

    System.out.print("Enter the String: ");
//    str = scan.nextLine();
        str="india";
    strRes="";
    vowels = "aeiouAEIOU";
    for(i=0; i<str.length(); i++)
    {
        count=0;
        ch = str.charAt(i);
        for(k=0; k<vowels.length(); k++)
        {
            if(ch==vowels.charAt(k))
                count++;
        }
        if(count==0)
            strRes = strRes + ch;
    }

    System.out.println("\nString without Vowels = " +strRes);
}

}
