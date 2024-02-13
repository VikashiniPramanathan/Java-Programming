package Arrays;

public class RotateCount {
    public static void main(String args[]) {
        int a[] = {1,2,3,4,5};
        int b[] = {3,4,5,1,2};
        int c=0;
        for(int i=0;i<b.length;i++){
            if(a[0]==b[i]){
                System.out.println(b.length-i);
            }
        }
    }
}
