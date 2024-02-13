package Strings;

public class palindrome {
/*    public static void main(String[] args){
        String str="mom";
        String str1="";
        for(int i=0;i<str.length();i++){
        //    str1=str.charAt(i)+str1;
            str1+=str.charAt(i);
        }
        System.out.println(str1+"\n");

        if(str.equals(str1)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }

 */
    public static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String a[]){
       // String str="madam";
        String str="monish";
        System.out.println(isPalindrome(str));
    }

}
