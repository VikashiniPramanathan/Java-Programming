package Strings;

import java.sql.SQLOutput;

public class RemoveDuplicate {
    public static void main(String args[]){
        String str="CsharpstarZ";
    //    String str2=str.toLowerCase();

        for(int i=0;i<str.length();i++) {
            int flag=0;
            for (int j = i+1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    flag = 1;
                    continue;
                }
            }
            if(flag==0){
                System.out.print(str.charAt(i));
            }
        }
    }
}
