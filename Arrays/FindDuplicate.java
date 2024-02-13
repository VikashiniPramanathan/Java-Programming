package Arrays;

public class FindDuplicate {
    public static void main(String args[]){
        int a[]={1, 2, 3, 6, 3, 6, 1};
        int flag=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.print(a[i]+" ");
                }
            }
        }
    }
}
