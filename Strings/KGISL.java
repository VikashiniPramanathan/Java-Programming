package Strings;

public class KGISL {
    // FINDING NAME IN STRING
/*    public static void main(String[] args) {
        int index = 0;
        String[] a = {"man", "can", "vikaash", "latha"};
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("vikaash")){
                System.out.println("Yes");
                index = i;
            }

        }

        System.out.println(index);
    }
}

 */


    public static void main(String[] args) {
        String[] a = {"man", "can", "vikaash", "latha"};
        int max = a[0].length();
        String ans="";
        for (int i = 1; i < a.length; i++) {
            if (max < a[i].length()) {
                max = a[i].length();
                ans=a[i];
            }
        }
        System.out.println(max);
        System.out.println(ans);
    }
}








