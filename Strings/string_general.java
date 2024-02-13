package Strings;

public class string_general {
    public static void main(String args[]){
        /*String str1="coding";
        String str2=" is fun";
        adding two strings
        str1=str1+str2;
        System.out.println(str1);*/


        /*checking two strings are equal
        //System.out.println(str1.equals(str2));*/


        /*using next
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        System.out.println(str1+" "+str1.length());*/

        /*using nextLine
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        System.out.println(str1+" "+str1.length());*/

        /*using next()
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        System.out.println(str1+" "+str1.length());
        String str2=sc.next();
    System.out.println(str2+" "+str2.length());*/

        String str1="hello";
        String str2="hello";
        String str3=new String("hello");
        //if(str1==str3){
        if(str1.equals(str3)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
