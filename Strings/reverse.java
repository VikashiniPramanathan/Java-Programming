package Strings;

public class reverse {
    public static void main(String args[]) {
        String str1 = "vikaash";
        String rev = "";
        /* for (int i = 0; i < str1.length(); i++) {
            rev = str1.charAt(i) + rev;
        }
        System.out.println(rev);
        */
        char a[]=str1.toCharArray();
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]);
        }
    }


}

