package Strings;

public class sub_string {
    public static void main(String args[]){
        String str="vikash";
        int n=str.length();
     /*   for(int i=0;i<n;i++){
            System.out.println(str.charAt(i));
        }

      */

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
        }

    }
}
