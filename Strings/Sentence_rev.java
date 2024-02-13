package Strings;

public class Sentence_rev {
     static public void main(String args[]){
        String s1="I drive a car in road";
        String rev=" ";
        String s[]=s1.split("");
        for(int i=0;i<s.length;i++){
            rev=s[i]+" "+rev;
        }
        System.out.println(rev);
    }
}
