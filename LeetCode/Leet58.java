package LeetCode;

public class Leet58 {
    public static void main(String[] args){
        String s="   fly me   to   the moon  ";
        int count=0;
        s=s.trim();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
