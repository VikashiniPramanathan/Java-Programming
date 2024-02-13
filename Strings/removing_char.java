//Example:
// input : banana (in this removing a)
// output : bnn


package Strings;
import java.util.*;
public class removing_char {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                if (i != str.length() - 1) {
                    i = i + 1;
                } else
                    break;
            }
            str2 = str2 + str.charAt(i);
        }
        System.out.println(str2);

    }
}
