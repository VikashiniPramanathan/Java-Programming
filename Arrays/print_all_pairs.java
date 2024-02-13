package Arrays;

public class print_all_pairs {
    public static void main(String args[]){
        int a[]=new int[]{1,2,3,4};
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                System.out.println("("+a[i]+","+a[j]+")");
            }
        }
    }
}
