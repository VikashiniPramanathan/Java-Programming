package Strings;

public class substring_of_string {
    public static void main(String args[]){
        String str="pqrs";

        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                System.out.println(str.substring(i,j+1));
            }
        }


    }
}
