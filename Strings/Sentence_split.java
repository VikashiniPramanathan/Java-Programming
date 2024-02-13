package Strings;

public class Sentence_split {
    public static void main(String[] args) {
      // String str="I like car";
        String str="Find an optimised solution";
        String[] word=str.split(" ");
        String revstr="";
        for(int i=word.length-1;i>=0;i--){
            String words=word[i];
            String revwrd="";
            for(int j=0;j<words.length();j++){
                revwrd=words.charAt(j)+revwrd;
            }
            revstr+=revwrd+" ";
        }
        System.out.println(revstr);
        


    }
}

