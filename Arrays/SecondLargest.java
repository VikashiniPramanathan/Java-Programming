package Arrays;

public class SecondLargest {
    public static void main(String args[]){
        int a[]={1,36,57,3};
        int first=a[0];
        int sec=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>first){
                sec=first;
                first=a[i];
            }
            else if (a[i]>sec) {
                sec=a[i];
            }
        }
        System.out.println(sec);
    }
}
