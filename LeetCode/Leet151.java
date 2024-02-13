package LeetCode;

public class Leet151 {
    public static void main(String args[]){
        String s="  hello world  ";
        String[] str=s.trim().split(" ");
        String rev="";
        for(int i=str.length-1;i>0;i--){

            rev=rev+str[i]+" ";
        }
        System.out.print(rev+str[0]);
    }
}
