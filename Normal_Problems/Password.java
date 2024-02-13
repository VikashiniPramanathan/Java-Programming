/*
Example:
      Input: 5345
      Output: Password correct
      Explain: last 3 digit can be divisible by first digit with leaving remainder

      Input: 2345
      Output: Incorrect code
      Explain: last 3 digit not divisible by first digit and leaves remainder
*/


package Normal_Problems;
import java.util.*;
public class Password {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter password: ");
        int pass=sc.nextInt();
        int a=pass/1000;
        System.out.println("a value: "+a);
        int b=pass%1000;
        System.out.println("b value: "+b);

        if(b%a==0){
            System.out.println("Password correct.");
        }
        else{
            System.out.println("Incorrect code.");
        }
    }
}
